package com.scenariobasedquestion.hospitalscenario;

// OutPatient with appointment info
public class OutPatient extends Patient {
    private String appointmentDate;
    private double consultationFee;

    public OutPatient(String id, String name, int age, String appointmentDate, double consultationFee) {
        super(id, name, age);
        this.appointmentDate = appointmentDate;
        this.consultationFee = consultationFee;
    }

    public double getServiceCharges() {
        return consultationFee;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Consultation Fee: " + consultationFee);
    }
}
