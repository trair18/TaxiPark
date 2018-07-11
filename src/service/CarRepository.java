package service;

import model.Car;
import model.MiniBus;
import model.PremiumCar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CarRepository {
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
        switch (type){
            case "car":
                return new Car(id, name, fuelConsumption, speed);
            case "premium car":
                boolean wifi = Boolean.valueOf(s[5]);
                boolean monitor = Boolean.valueOf(s[6]);
                return new PremiumCar(id, name, fuelConsumption, speed, wifi, monitor);
            case "mini bus":
                String function = s[5];
                return new MiniBus(id, name, fuelConsumption, speed, function);
        }
        return null;
    }
}
