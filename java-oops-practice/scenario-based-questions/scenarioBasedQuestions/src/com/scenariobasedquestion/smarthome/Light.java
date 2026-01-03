package com.scenariobasedquestion.smarthome;

public class Light extends Appliance {
    private int brightness;

    public Light(String name, double power) {
        super(name, power);
        this.brightness = 50; // default brightness
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println(getName() + " is now ON with brightness " + brightness);
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println(getName() + " is now OFF");
    }

    public void setBrightness(int b) {
        this.brightness = b;
        System.out.println("Brightness set to " + b);
    }
}
