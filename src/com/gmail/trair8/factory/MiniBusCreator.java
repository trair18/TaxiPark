package com.gmail.trair8.factory;

import com.gmail.trair8.model.Car;
import com.gmail.trair8.model.MiniBus;
import com.gmail.trair8.model.MiniBusType;

public class MiniBusCreator extends AbstractCreator{
    @Override
    public Car create(String[] s) {
        MiniBus miniBus = new MiniBus();
        initCar(miniBus, s);
        if (s[6].equals("passenger")){
            miniBus.setFunction(MiniBusType.PASSENGER);
        }else if(s[6].equals("cargo")){
            miniBus.setFunction(MiniBusType.CARGO);
        } else {
            miniBus.setFunction(MiniBusType.UNIVERSAL);
        }
        return miniBus;
    }
}
