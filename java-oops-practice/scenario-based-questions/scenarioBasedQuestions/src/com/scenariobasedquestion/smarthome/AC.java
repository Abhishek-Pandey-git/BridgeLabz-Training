package com.scenariobasedquestion.smarthome;

public class AC extends Appliance {
    private int temp;

    public AC(String name, double power) {
        super(name, power);
        this.temp = 24; // default temp
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " AC is cooling at " + temp + " degrees");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " AC is turned off");
    }

    public void setTemp(int t) {
        this.temp = t;
        System.out.println("AC temperature set to " + t);
    }
}
