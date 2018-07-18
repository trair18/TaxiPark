package com.gmail.trair8.factory;

import com.gmail.trair8.model.Car;
import com.gmail.trair8.model.CarType;

public class CarCreator extends AbstractCreator{
    public Car create(String[] s) {
        Car car = new Car();
        initCar(car, s);
        car.setType(CarType.valueOf(s[6]));
        return car;
    }
}
