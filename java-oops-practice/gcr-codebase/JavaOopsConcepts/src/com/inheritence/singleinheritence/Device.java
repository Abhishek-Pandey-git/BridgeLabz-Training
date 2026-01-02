package com.inheritence.singleinheritence;

// General device superclass for smart home devices
public class Device {
    protected String deviceId;
    protected boolean status; // true = ON, false = OFF

    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}
