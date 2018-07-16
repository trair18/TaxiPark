package com.gmail.trair8.service;

import com.gmail.trair8.model.Car;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getFuelConsumption() > o2.getFuelConsumption()? 1 : o1.getFuelConsumption() == o2.getFuelConsumption() ? 0 : -1;
    }
}