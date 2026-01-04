package com.encapsulationpolymorphisminterfaceandabstractclass;

//bike class
public class Q3_Bike extends Q3_Vehicle implements Q3_Insurable {
    
    private String insurancePolicyNumber;
    
    public Q3_Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    
    @Override
    public double calculateRentalCost(int days) {
        //rental cost for bike is cheaper
        return getRentalRate() * days * 0.8;
    }
    
    @Override
    public double calculateInsurance() {
        //3% of rental rate
        return getRentalRate() * 0.03;
    }
    
    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
    
    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }
    
    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
}
