package com.objectmodelling.selfproblems;

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital hosp = new Hospital("City Hospital");

        Doctor drSmith = new Doctor("Smith");
        Doctor drJones = new Doctor("Jones");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        hosp.addDoctor(drSmith);
        hosp.addDoctor(drJones);
        hosp.addPatient(p1);
        hosp.addPatient(p2);

        drSmith.consult(p1);
        drSmith.consult(p2);
        drJones.consult(p1);

        System.out.println();
        p1.viewDoctors();
        System.out.println();
        for (Patient pt : drSmith.getPatients()) {
            System.out.println("Dr. Smith patient: " + pt.getName());
        }
    }
}
