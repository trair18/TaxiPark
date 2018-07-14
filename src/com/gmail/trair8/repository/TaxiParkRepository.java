package com.gmail.trair8.repository;

import com.gmail.trair8.model.Car;
import com.gmail.trair8.model.MiniBus;
import com.gmail.trair8.model.PremiumCar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TaxiParkRepository {
    public ArrayList<Car> findAll(){
        ArrayList<Car> cars = new ArrayList<Car>();
        try {
            Scanner scanner = new Scanner(new File("cars.txt"));
            while (scanner.hasNextLine()){
                String[] s = scanner.nextLine().split(", ");
                cars.add(createCar(s));
            }
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        return cars;
    }

    private Car createCar(String[] s){
        String type = s[0];
        int id = Integer.valueOf(s[1]);
        String name = s[2];
        double fuelConsumption = Double.valueOf(s[3]);
        int speed = Integer.valueOf(s[4]);
        int price = Integer.valueOf(s[5]);
        switch (type){
            case "car":
                return new Car(id, name, fuelConsumption, speed, price);
            case "premium car":
                boolean wifi = Boolean.valueOf(s[6]);
                boolean monitor = Boolean.valueOf(s[7]);
                return new PremiumCar(id, name, fuelConsumption, speed, price, wifi, monitor);
            case "mini bus":
                String function = s[6];
                return new MiniBus(id, name, fuelConsumption, speed, price, function);
        }
        return null;
    }
}
