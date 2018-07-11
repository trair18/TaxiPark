package service;

import model.Car;
import model.TaxiPark;

import java.util.ArrayList;
import java.util.Arrays;

public class CarService {
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
}
