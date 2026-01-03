package com.scenariobasedquestion.hospitalscenario;

// InPatient extends Patient with room and days
public class InPatient extends Patient {
    private String roomNumber;
    private int daysAdmitted;
    private double perDayCharge;

    public InPatient(String id, String name, int age, String medicalHistory,
                     String roomNumber, int daysAdmitted, double perDayCharge) {
        super(id, name, age, medicalHistory);
        this.roomNumber = roomNumber;
        this.daysAdmitted = daysAdmitted;
        this.perDayCharge = perDayCharge;
    }

    public double getServiceCharges() {
        return daysAdmitted * perDayCharge;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Room: " + roomNumber);
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Per Day Charge: " + perDayCharge);
    }
}
