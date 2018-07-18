package com.gmail.trair8.model;

public class PremiumCar extends Car {

    private boolean wifi;
    private boolean monitor;

    public PremiumCar(){}

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PremiumCar premiumCar = (PremiumCar) o;
        if (wifi != premiumCar.wifi) return false;
        if (monitor != premiumCar.monitor) return false;
        return true;
    }

    @Override
    public int hashCode() {

        return super.hashCode() + (wifi ? 3 : 1) + (monitor ? 4 : 2);
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                "{wifi=" + wifi +
                ", monitor=" + monitor +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

}
