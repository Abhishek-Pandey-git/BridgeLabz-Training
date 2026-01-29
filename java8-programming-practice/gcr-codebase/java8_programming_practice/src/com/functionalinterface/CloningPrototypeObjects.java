package com.functionalinterface;

class Product implements Cloneable {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

class Employee implements Cloneable {
    private String name;
    private String department;
    
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "'}";
    }
}

public class CloningPrototypeObjects {
    public static void main(String[] args) {
        try {
            Product original = new Product("Laptop", 50000);
            Product cloned = (Product) original.clone();
            
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
            
            Employee emp1 = new Employee("John", "IT");
            Employee emp2 = (Employee) emp1.clone();
            
            System.out.println("\nOriginal: " + emp1);
            System.out.println("Cloned: " + emp2);
            
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failed: " + e.getMessage());
        }
    }
}
