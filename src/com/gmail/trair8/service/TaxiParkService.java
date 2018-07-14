package com.gmail.trair8.service;

import com.gmail.trair8.model.Car;
import com.gmail.trair8.model.TaxiPark;

import java.util.ArrayList;

public class TaxiParkService {
    public void sort(TaxiPark taxiPark){
        CarComparator carComparator = new CarComparator();
        taxiPark.getCars().sort(carComparator);
    }

    public void print(TaxiPark taxiPark){
        for (Car car: taxiPark.getCars()) {
            System.out.println(car);
        }
    }

    public ArrayList<Car> search(int a, int b, TaxiPark taxiPark){
        ArrayList<Car> searchCars = new ArrayList<Car>();
        for (Car car: taxiPark.getCars()) {
            if (car.getSpeed() >= a && car.getSpeed() <= b){
                searchCars.add(car);
            }
        }
        return searchCars;
    }

    public int cost(TaxiPark taxiPark){
        int sum = 0;
        for (Car car: taxiPark.getCars()) {
            sum += car.getPrice();
        }
        return sum;
    }
}
