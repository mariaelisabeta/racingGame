package org.fasttrackit;

public class AutoVehicle extends Vehicle {
    private double mileage;
    private double fuelLevel;
    Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;


        System.out.println("custom constructor called.");
    }


    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
