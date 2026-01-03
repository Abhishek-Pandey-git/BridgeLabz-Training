package com.scenariobasedquestion.smarthome;

import java.util.ArrayList;

public class UserController {
    private ArrayList<Appliance> myDevices;

    public UserController() {
        myDevices = new ArrayList<>();
    }

    public void addDevice(Appliance a) {
        myDevices.add(a);
        System.out.println("Added " + a.getName() + " to system");
    }

    public void turnAllOn() {
        System.out.println("Turning everything on...");
        for (int i = 0; i < myDevices.size(); i++) {
            myDevices.get(i).turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println("Turning everything off...");
        for (Appliance a : myDevices) {
            a.turnOff();
        }
    }

    public void showStatus() {
        System.out.println("--- Home Status ---");
        for (Appliance a : myDevices) {
            String s = a.isOn() ? "ON" : "OFF";
            System.out.println(a.getName() + " is " + s);
        }
    }
}
