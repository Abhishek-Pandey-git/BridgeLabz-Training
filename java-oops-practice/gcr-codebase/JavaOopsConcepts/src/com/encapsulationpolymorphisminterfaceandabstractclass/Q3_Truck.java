package com.encapsulationpolymorphisminterfaceandabstractclass;

//truck class
public class Q3_Truck extends Q3_Vehicle implements Q3_Insurable {
    
    private String insurancePolicyNumber;
    
    public Q3_Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    
    @Override
    public double calculateRentalCost(int days) {
        //truck rental cost is higher
        return getRentalRate() * days * 1.5;
    }
    
    @Override
    public double calculateInsurance() {
        //8% of rental rate for trucks
        return getRentalRate() * 0.08;
    }
    
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
    
    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }
    
    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
}
