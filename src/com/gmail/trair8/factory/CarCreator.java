package com.gmail.trair8.factory;

import com.gmail.trair8.model.Car;

public class CarCreator extends AbstractCreator{
    public Car create(String[] s)
    {
        Car car = new Car();
        car.setId(Integer.valueOf(s[1]));
        car.setName(s[2]);
        car.setFuelConsumption(Double.valueOf(s[3]));
        car.setSpeed(Integer.valueOf(s[4]));
        car.setPrice(Integer.valueOf(s[5]));
        return car;
    }
}
