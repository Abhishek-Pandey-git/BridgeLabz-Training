package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

//main class to test employee management system
public class Q1_EmployeeManagementDemo {
    
    public static void main(String[] args) {
        
        //creating list of employees
        ArrayList<Q1_Employee> employees = new ArrayList<>();
        
        //creating full time employees
        Q1_FullTimeEmployee emp1 = new Q1_FullTimeEmployee(101, "John Smith", 30000, 20000);
        emp1.assignDepartment("IT Department");
        
        Q1_FullTimeEmployee emp2 = new Q1_FullTimeEmployee(102, "Sarah Johnson", 35000, 25000);
        emp2.assignDepartment("HR Department");
        
        //creating part time employees
        Q1_PartTimeEmployee emp3 = new Q1_PartTimeEmployee(103, "Mike Brown", 10000, 80, 150);
        emp3.assignDepartment("Sales Department");
        
        Q1_PartTimeEmployee emp4 = new Q1_PartTimeEmployee(104, "Lisa Davis", 8000, 60, 200);
        emp4.assignDepartment("Marketing Department");
        
        //adding to list
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        
        //displaying employee details using polymorphism
        System.out.println("Employee Management System");
        System.out.println("===========================");
        
        for(int i=0; i<employees.size(); i++) {
            Q1_Employee e = employees.get(i);
            e.displayDetails();
            
            //checking department details
            if(e instanceof Q1_Department) {
                Q1_Department d = (Q1_Department)e;
                System.out.println("Department: " + d.getDepartmentDetails());
            }
            System.out.println("-------------------");
        }
    }
}
