package com.gmail.trair8.factory;

import com.gmail.trair8.model.Car;
import com.gmail.trair8.model.PremiumCar;

public class PremiumCarCreator extends AbstractCreator{
    @Override
    public Car create(String[] s) {
        PremiumCar premiumCar = new PremiumCar();
        initCar(premiumCar, s);;
        premiumCar.setWifi(Boolean.valueOf(s[6]));
        premiumCar.setMonitor(Boolean.valueOf(s[7]));
        return premiumCar;
    }
}
