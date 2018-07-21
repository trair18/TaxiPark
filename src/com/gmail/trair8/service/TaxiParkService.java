package com.gmail.trair8.service;

import com.gmail.trair8.model.Car;
import com.gmail.trair8.model.TaxiPark;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;


public class TaxiParkService {

    private static final Logger logger = Logger.getLogger(TaxiParkService.class);

    public static void sort(TaxiPark taxiPark){
        taxiPark.getCars().sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
               return o1.getFuelConsumption() > o2.getFuelConsumption()? 1 : o1.getFuelConsumption() == o2.getFuelConsumption() ? 0 : -1;
            }
        });
    }

    public static ArrayList<Car> search(int a, int b, TaxiPark taxiPark){
        ArrayList<Car> searchCars = new ArrayList<Car>();
        for (Car car: taxiPark.getCars()) {
            if (car.getSpeed() >= a && car.getSpeed() <= b){
                searchCars.add(car);
            }
        }
        return searchCars;
    }

    public static int getCost(TaxiPark taxiPark){
        int sum = 0;
        for (Car car: taxiPark.getCars()) {
            sum += car.getPrice();
            logger.debug("sum = " + sum);
        }
        return sum;
    }
}
