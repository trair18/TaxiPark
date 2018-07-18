package com.gmail.trair8.factory;

import com.gmail.trair8.model.Car;
import com.gmail.trair8.model.MiniBus;
import com.gmail.trair8.model.MiniBusType;

public class MiniBusCreator extends AbstractCreator{
    @Override
    public Car create(String[] s) {
        MiniBus miniBus = new MiniBus();
        initCar(miniBus, s);
        miniBus.setFunction(MiniBusType.valueOf(s[6]));
        return miniBus;
    }
}
