package com.gmail.trair8.model;

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
