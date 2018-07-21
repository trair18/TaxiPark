package com.gmail.trair8.repository;

import com.gmail.trair8.factory.FactoryMethod;
import com.gmail.trair8.model.Car;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TaxiParkRepository {

    private static final Logger logger = Logger.getLogger(TaxiParkRepository.class);

    public List<Car> findAll() {
        List<Car> cars = new ArrayList<Car>();
        FactoryMethod factoryMethod = new FactoryMethod();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("cars.txt"));
            byte[] a = new byte[fileInputStream.available()];
            fileInputStream.read(a, 0, fileInputStream.available());
            String p = new String(a);
            logger.debug(p);
            String[] w = p.split("\n");
            for (String q: w) {
                String[] s = q.split("(, )|($)");
                Car car = factoryMethod.getCreator(s[0]).create(s);
                cars.add(car);
            }
            fileInputStream.close();
        } catch (FileNotFoundException ex) {
            logger.error("File not Found", ex);
        } catch (IOException ex) {
            logger.error("IOException", ex);
        }
        return cars;
    }

}
