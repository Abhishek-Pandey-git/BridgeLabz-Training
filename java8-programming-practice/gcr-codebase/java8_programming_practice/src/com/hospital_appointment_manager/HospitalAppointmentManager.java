package com.hospital_appointment_manager;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HospitalAppointmentManager {
    public static void main(String[] args) {
        // Create appointment data
        List<Appointment> appointments = Arrays.asList(
            new Appointment("Alice", "Dr. Rao", "Cardiology", LocalDate.of(2025, 8, 10)),
            new Appointment("Bob", "Dr. Rao", "Cardiology", LocalDate.of(2025, 8, 11)),
            new Appointment("Charlie", "Dr. Mehta", "Neurology", LocalDate.of(2025, 8, 12)),
            new Appointment("David", "Dr. Rao", "Cardiology", LocalDate.of(2025, 8, 13)),
            new Appointment("Eve", "Dr. Singh", "Orthopedics", LocalDate.of(2025, 8, 14))
        );
        
        // Filter appointments by doctor
        System.out.println("=== Appointments with Dr. Rao ===");
        appointments.stream()
            .filter(a -> a.getDoctorName().equals("Dr. Rao"))
            .forEach(System.out::println);
        
        // Group appointments by doctor
        System.out.println("\n=== Appointments Grouped by Doctor ===");
        Map<String, List<Appointment>> groupedByDoctor = appointments.stream()
            .collect(Collectors.groupingBy(Appointment::getDoctorName));
        System.out.println(groupedByDoctor);
        
        // Count appointments per department
        System.out.println("\n=== Appointments Count by Department ===");
        Map<String, Long> countByDept = appointments.stream()
            .collect(Collectors.groupingBy(Appointment::getDepartment, Collectors.counting()));
        System.out.println(countByDept);
        
        // Sort appointments by date
        System.out.println("\n=== Appointments Sorted by Date ===");
        appointments.stream()
            .sorted(Comparator.comparing(Appointment::getDate))
            .forEach(System.out::println);
    }
}
