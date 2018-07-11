package model;

import java.util.ArrayList;

public class TaxiPark {
    private ArrayList<Car> cars;

    public TaxiPark(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

}
