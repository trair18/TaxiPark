package com.gmail.trair8.factory;

import com.gmail.trair8.model.Car;
import com.gmail.trair8.model.MiniBus;
import com.gmail.trair8.model.MiniBusType;

public class MiniBusCreator extends AbstractCreator{
    @Override
    public Car create(String[] s) {
        MiniBus miniBus = new MiniBus();
        miniBus.setId(Integer.valueOf(s[1]));
        miniBus.setName(s[2]);
        miniBus.setFuelConsumption(Double.valueOf(s[3]));
        miniBus.setSpeed(Integer.valueOf(s[4]));
        miniBus.setPrice(Integer.valueOf(s[5]));
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
