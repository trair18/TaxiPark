package com.gmail.trair8.model;

public class PremiumCar extends Car {
    private boolean wifi;
    private boolean monitor;

    public PremiumCar(int id, String name, double fuelConsumption, int speed, int price, boolean wifi, boolean monitor) {
        super(id, name, fuelConsumption, speed, price);
        this.wifi = wifi;
        this.monitor = monitor;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isMonitor() {
        return monitor;
    }

    public void setMonitor(boolean monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PremiumCar{" +
                "wifi=" + wifi +
                ", monitor=" + monitor +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
