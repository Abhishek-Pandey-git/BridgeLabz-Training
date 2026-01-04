package com.encapsulationpolymorphisminterfaceandabstractclass;

//part time employee
public class Q1_PartTimeEmployee extends Q1_Employee implements Q1_Department {
    
    private int hoursWorked;
    private double hourlyRate;
    private String department;
    
    public Q1_PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    //calculate salary based on hours
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }
    
    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }
    
    @Override
    public String getDepartmentDetails() {
        return department;
    }
    
    public int getHoursWorked() {
        return hoursWorked;
    }
    
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public double getHourlyRate() {
        return hourlyRate;
    }
    
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
