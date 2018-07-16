package com.gmail.trair8.model;

import java.util.Objects;

public class MiniBus extends Car {

    private String function;

    public MiniBus(int id, String name, double fuelConsumption, int speed, int price, String type) {
        super(id, name, fuelConsumption, speed, price);
        this.function = type;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MiniBus miniBus = (MiniBus) o;
        return Objects.equals(function, miniBus.function);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), function);
    }

    @Override
    public String toString() {
        return "MiniBus{" +
                "function='" + function + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
