package com.gmail.trair8.factory;

import com.gmail.trair8.model.Car;

public class CarCreator extends AbstractCreator{
    public Car create(String[] s) {
        Car car = new Car();
        initCar(car, s);
        return car;
    }
}
