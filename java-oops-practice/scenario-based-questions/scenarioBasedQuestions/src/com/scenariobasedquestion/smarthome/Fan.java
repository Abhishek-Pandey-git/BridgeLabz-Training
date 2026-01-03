package com.scenariobasedquestion.smarthome;

public class Fan extends Appliance {
    private int speed;

    public Fan(String name, double power) {
        super(name, power);
        this.speed = 1; // default speed
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " fan is spinning at speed " + speed);
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " fan stopped");
    }

    public void setSpeed(int s) {
        this.speed = s;
        System.out.println("Fan speed changed to " + s);
    }
}
