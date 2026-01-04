package com.encapsulationpolymorphisminterfaceandabstractclass;

//car class
public class Q3_Car extends Q3_Vehicle implements Q3_Insurable {
    
    private String insurancePolicyNumber;
    
    public Q3_Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    
    @Override
    public double calculateRentalCost(int days) {
        //rental cost for car
        return getRentalRate() * days;
    }
    
    @Override
    public double calculateInsurance() {
        //5% of rental rate as insurance
        return getRentalRate() * 0.05;
    }
    
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
    
    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }
    
    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
}
