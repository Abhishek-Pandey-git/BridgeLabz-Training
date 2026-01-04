package com.encapsulationpolymorphisminterfaceandabstractclass;

//full time employee class
public class Q1_FullTimeEmployee extends Q1_Employee implements Q1_Department {
    
    private double fixedSalary;
    private String department;
    
    public Q1_FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }
    
    //calculating salary for full time employee
    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
    }
    
    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }
    
    @Override
    public String getDepartmentDetails() {
        return department;
    }
    
    public double getFixedSalary() {
        return fixedSalary;
    }
    
    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
}
