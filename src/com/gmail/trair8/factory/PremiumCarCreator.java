package com.gmail.trair8.factory;

import com.gmail.trair8.model.Car;
import com.gmail.trair8.model.PremiumCar;

public class PremiumCarCreator extends AbstractCreator{
    @Override
    public Car create(String[] s) {
        PremiumCar premiumCar = new PremiumCar();
        premiumCar.setId(Integer.valueOf(s[1]));
        premiumCar.setName(s[2]);
        premiumCar.setFuelConsumption(Double.valueOf(s[3]));
        premiumCar.setSpeed(Integer.valueOf(s[4]));
        premiumCar.setPrice(Integer.valueOf(s[5]));
        premiumCar.setWifi(Boolean.valueOf(s[6]));
        premiumCar.setMonitor(Boolean.valueOf(s[7]));
        return premiumCar;
    }
}
