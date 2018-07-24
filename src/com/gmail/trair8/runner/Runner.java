package com.gmail.trair8.runner;

import com.gmail.trair8.model.Car;
import com.gmail.trair8.model.TaxiPark;
import com.gmail.trair8.repository.TaxiParkRepository;
import com.gmail.trair8.service.TaxiParkService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {

    private static final Logger LOGGER = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {

        TaxiPark taxiPark = new TaxiPark();
        TaxiParkRepository taxiParkRepository = new TaxiParkRepository();
        taxiPark.setCars(taxiParkRepository.findAll());

        Scanner scanner = new Scanner(System.in);
        String s;

        while (!(s = scanner.nextLine()).equals("exit")){
            if(s.equals("sort()")){
                TaxiParkService.sort(taxiPark);
                print(taxiPark.getCars());
            } else if(s.equals("print()")){
                print(taxiPark.getCars());
            } else if(s.matches("search\\(\\d+, \\d+\\)")) {
                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher(s);
                m.find();
                int i = Integer.parseInt(m.group());
                m.find();
                int j = Integer.parseInt(m.group());
                print(TaxiParkService.search(i, j, taxiPark));
            }else if(s.equals("getCost()")){
                LOGGER.info(TaxiParkService.getCost(taxiPark));
            } else {
                LOGGER.info("try again");
            }
        }
        scanner.close();
    }

    private static void print(List<Car> cars){
        for (Car car: cars) {
            LOGGER.info(car);
        }
    }
}
