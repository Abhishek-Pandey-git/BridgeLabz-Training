package com.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Group Objects by Property
 * Given a list of Employee objects, group them by their department using a
 * Map<Department, List<Employee>>.
 * Example: Employees: [Alice (HR), Bob (IT), Carol (HR)] → 
 * Output: HR: [Alice, Carol], IT: [Bob]
 */
public class GroupObjectsByProperty {

    /**
     * Employee class
     */
    static class Employee {
        private String name;
        private String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public String toString() {
            return name + " (" + department + ")";
        }
    }

    /**
     * Groups employees by department using manual iteration
     * 
     * @param employees List of employees
     * @return Map with department as key and list of employees as value
     */
    public static Map<String, List<Employee>> groupByDepartmentManual(List<Employee> employees) {
        Map<String, List<Employee>> result = new HashMap<>();

        for (Employee employee : employees) {
            String department = employee.getDepartment();
            
            if (!result.containsKey(department)) {
                result.put(department, new ArrayList<>());
            }
            
            result.get(department).add(employee);
        }

        return result;
    }

    /**
     * Groups employees by department using computeIfAbsent
     * 
     * @param employees List of employees
     * @return Map with department as key and list of employees as value
     */
    public static Map<String, List<Employee>> groupByDepartmentComputeIfAbsent(List<Employee> employees) {
        Map<String, List<Employee>> result = new HashMap<>();

        for (Employee employee : employees) {
            result.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>())
                  .add(employee);
        }

        return result;
    }

    /**
     * Groups employees by department using Java Streams
     * 
     * @param employees List of employees
     * @return Map with department as key and list of employees as value
     */
    public static Map<String, List<Employee>> groupByDepartmentStream(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }

    /**
     * Prints the grouped employees in a readable format
     * 
     * @param groupedEmployees Map of department to list of employees
     */
    public static void printGroupedEmployees(Map<String, List<Employee>> groupedEmployees) {
        groupedEmployees.forEach((department, employees) -> {
            System.out.print(department + ": [");
            for (int i = 0; i < employees.size(); i++) {
                System.out.print(employees.get(i).getName());
                if (i < employees.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        });
    }

    public static void main(String[] args) {
        // Test case 1: Example from problem
        List<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee("Alice", "HR"));
        employees1.add(new Employee("Bob", "IT"));
        employees1.add(new Employee("Carol", "HR"));

        System.out.println("Test Case 1:");
        System.out.println("Employees: " + employees1);
        System.out.println("\nGrouped (Manual):");
        printGroupedEmployees(groupByDepartmentManual(employees1));
        System.out.println("\nGrouped (computeIfAbsent):");
        printGroupedEmployees(groupByDepartmentComputeIfAbsent(employees1));
        System.out.println("\nGrouped (Stream):");
        printGroupedEmployees(groupByDepartmentStream(employees1));
        System.out.println();

        // Test case 2: Multiple departments
        List<Employee> employees2 = new ArrayList<>();
        employees2.add(new Employee("David", "Finance"));
        employees2.add(new Employee("Eve", "IT"));
        employees2.add(new Employee("Frank", "HR"));
        employees2.add(new Employee("Grace", "Finance"));
        employees2.add(new Employee("Henry", "IT"));
        employees2.add(new Employee("Ivy", "Marketing"));

        System.out.println("Test Case 2: Multiple Departments");
        System.out.println("Employees: " + employees2);
        System.out.println("\nGrouped:");
        printGroupedEmployees(groupByDepartmentStream(employees2));
        System.out.println();

        // Test case 3: All in same department
        List<Employee> employees3 = new ArrayList<>();
        employees3.add(new Employee("John", "Sales"));
        employees3.add(new Employee("Jane", "Sales"));
        employees3.add(new Employee("Jack", "Sales"));

        System.out.println("Test Case 3: All in Same Department");
        System.out.println("Employees: " + employees3);
        System.out.println("\nGrouped:");
        printGroupedEmployees(groupByDepartmentStream(employees3));
        System.out.println();

        // Test case 4: Single employee
        List<Employee> employees4 = new ArrayList<>();
        employees4.add(new Employee("Mike", "Operations"));

        System.out.println("Test Case 4: Single Employee");
        System.out.println("Employees: " + employees4);
        System.out.println("\nGrouped:");
        printGroupedEmployees(groupByDepartmentStream(employees4));
        System.out.println();

        // Test case 5: Empty list
        List<Employee> employees5 = new ArrayList<>();

        System.out.println("Test Case 5: Empty List");
        System.out.println("Employees: " + employees5);
        System.out.println("Grouped: " + groupByDepartmentStream(employees5));
    }
}
