package com.gmail.trair8.model;

import java.util.ArrayList;
import java.util.Objects;

public class TaxiPark {

    private ArrayList<Car> cars;

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxiPark taxiPark = (TaxiPark) o;
        return Objects.equals(cars, taxiPark.cars);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cars);
    }

    @Override
    public String toString() {
        return "TaxiPark{" +
                "cars=" + cars +
                '}';
    }
}
