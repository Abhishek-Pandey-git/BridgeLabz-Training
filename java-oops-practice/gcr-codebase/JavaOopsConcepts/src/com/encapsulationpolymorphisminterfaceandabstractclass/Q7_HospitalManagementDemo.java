package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

//hospital patient management demo
public class Q7_HospitalManagementDemo {
    
    public static void main(String[] args) {
        
        //creating patient list
        ArrayList<Q7_Patient> patients = new ArrayList<>();
        
        //creating in patients
        Q7_InPatient inPat1 = new Q7_InPatient(1001, "Rajesh Kumar", 45, 5, 2000);
        inPat1.addRecord("Admitted for surgery");
        inPat1.addRecord("Surgery completed successfully");
        
        Q7_InPatient inPat2 = new Q7_InPatient(1002, "Sita Devi", 60, 3, 1500);
        inPat2.addRecord("Admitted for observation");
        
        //creating out patients
        Q7_OutPatient outPat1 = new Q7_OutPatient(2001, "Arun Sharma", 35, 500, 2);
        outPat1.addRecord("General checkup");
        outPat1.addRecord("Follow up consultation");
        
        Q7_OutPatient outPat2 = new Q7_OutPatient(2002, "Meera Patel", 28, 800, 3);
        outPat2.addRecord("Dental consultation");
        
        patients.add(inPat1);
        patients.add(inPat2);
        patients.add(outPat1);
        patients.add(outPat2);
        
        System.out.println("Hospital Patient Management");
        System.out.println("===========================");
        
        //processing patients using polymorphism
        for(int i=0; i<patients.size(); i++) {
            Q7_Patient p = patients.get(i);
            p.getPatientDetails();
            System.out.println("Total Bill: Rs." + p.calculateBill());
            
            //viewing medical records
            if(p instanceof Q7_MedicalRecord) {
                Q7_MedicalRecord rec = (Q7_MedicalRecord)p;
                rec.viewRecords();
            }
            System.out.println("-------------------");
        }
    }
}
