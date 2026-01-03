package com.scenariobasedquestion.smarthome;

public class SmartHomeDemo {
    public static void main(String[] args) {
        // creating devices
        Light hallLight = new Light("Hall Light", 15.0);
        Fan bedFan = new Fan("Bedroom Fan", 60.0);
        AC mainAC = new AC("Main AC", 1500.0);

        // user controller
        UserController myHome = new UserController();
        myHome.addDevice(hallLight);
        myHome.addDevice(bedFan);
        myHome.addDevice(mainAC);

        System.out.println();
        
        // testing polymorphism
        myHome.turnAllOn();
        
        System.out.println();
        
        // testing specific methods
        hallLight.setBrightness(80);
        bedFan.setSpeed(3);
        mainAC.setTemp(22);
        
        System.out.println();
        
        // comparing power usage
        mainAC.comparePower(bedFan);
        hallLight.comparePower(bedFan);
        
        System.out.println();
        
        myHome.showStatus();
        
        System.out.println();
        
        myHome.turnAllOff();
    }
}
