package com.gmail.trair8.service;

import com.gmail.trair8.model.Car;
import com.gmail.trair8.model.TaxiPark;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;


public class TaxiParkService {

    private static final Logger logger = LogManager.getLogger(TaxiParkService.class);

    /**
     * Sort park cars by fuel consumption
     * @param taxiPark
     * actual taxi park
     */
    public static void sort(TaxiPark taxiPark){
        taxiPark.getCars().sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
               return o1.getFuelConsumption() > o2.getFuelConsumption()? 1 : o1.getFuelConsumption() == o2.getFuelConsumption() ? 0 : -1;
            }
        });
    }

    /**
     *Search car by speed range
     * @param start
     * start of range
     * @param end
     * end of range
     * @param taxiPark
     * actual taxi park
     * @return
     * list of searched cars
     */
    public static ArrayList<Car> search(int start, int end, TaxiPark taxiPark){
        ArrayList<Car> searchCars = new ArrayList<Car>();
        for (Car car: taxiPark.getCars()) {
            if (car.getSpeed() >= start && car.getSpeed() <= end){
                searchCars.add(car);
            }
        }
        return searchCars;
    }

    /**
     * calculate sum of park cars
     * @param taxiPark
     * actual taxi park
     * @return
     * sum of park cars
     */
    public static int getCost(TaxiPark taxiPark){
        int sum = 0;
        for (Car car: taxiPark.getCars()) {
            sum += car.getPrice();
            logger.debug("sum = " + sum);
        }
        return sum;
    }
}
