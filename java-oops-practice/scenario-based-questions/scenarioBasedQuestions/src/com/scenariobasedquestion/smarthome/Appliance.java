package com.scenariobasedquestion.smarthome;

// this is base class for all appliances
public abstract class Appliance implements Controllable {
    private String name;
    private boolean isOn;
    private double powerUsage; // in watts

    // constructor to set name and power
    public Appliance(String name, double powerUsage) {
        this.name = name;
        this.powerUsage = powerUsage;
        this.isOn = false; // default is off
    }

    // getter for name
    public String getName() {
        return name;
    }

    // getter for power
    public double getPowerUsage() {
        return powerUsage;
    }

    // check if it is on
    public boolean isOn() {
        return isOn;
    }

    // setter for status
    public void setOn(boolean on) {
        isOn = on;
    }

    // method to compare energy usage
    public void comparePower(Appliance other) {
        if (this.powerUsage > other.powerUsage) {
            System.out.println(this.name + " uses more power than " + other.name);
        } else if (this.powerUsage < other.powerUsage) {
            System.out.println(this.name + " uses less power than " + other.name);
        } else {
            System.out.println("Both use same power");
        }
    }
}
