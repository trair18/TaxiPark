package com.gmail.trair8.model;

import java.util.Objects;

public class Car{

    protected int id;
    protected String name;
    protected double fuelConsumption;
    protected int speed;
    protected int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(int id, String name, double fuelConsumption, int speed, int price) {
        this.id = id;
        this.name = name;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                Double.compare(car.fuelConsumption, fuelConsumption) == 0 &&
                speed == car.speed &&
                price == car.price &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, fuelConsumption, speed, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
