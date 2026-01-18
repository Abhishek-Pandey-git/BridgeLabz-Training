package com.javagenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResumeScreeningSystem {
    
    //generic method to screen resume
    public static <T extends JobRole> boolean screenResume(Resume<T> resume){
        if(resume.getYearsOfExperience()>=resume.getJobRole().getExperienceRequired()){
            System.out.println("✓ "+resume.getCandidateName()+" PASSED screening for "+resume.getJobRole().getRoleName());
            return true;
        }else{
            System.out.println("✗ "+resume.getCandidateName()+" FAILED screening (Insufficient experience)");
            return false;
        }
    }
    
    //wildcard method
    public static void displayAllResumes(List<? extends Resume<?>> resumes){
        System.out.println("\n=== All Submitted Resumes ===");
        if(resumes.isEmpty()){
            System.out.println("No resumes submitted");
        }else{
            for(int i=0;i<resumes.size();i++){
                System.out.println((i+1)+". "+resumes.get(i));
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Resume<?>> allResumes=new ArrayList<>();
        List<Resume<?>> selectedResumes=new ArrayList<>();
        
        while(true){
            System.out.println("\n--- Resume Screening System ---");
            System.out.println("1. Submit Software Engineer Resume");
            System.out.println("2. Submit Data Scientist Resume");
            System.out.println("3. Submit Product Manager Resume");
            System.out.println("4. View All Resumes");
            System.out.println("5. Screen All Resumes");
            System.out.println("6. View Selected Candidates");
            System.out.println("7. Exit");
            System.out.print("Select: ");
            
            int choice=sc.nextInt();
            sc.nextLine();
            
            if(choice==1){
                System.out.print("Candidate Name: ");
                String name=sc.nextLine();
                System.out.print("Years of Experience: ");
                int exp=sc.nextInt();
                sc.nextLine();
                System.out.print("Skills (comma separated): ");
                String skills=sc.nextLine();
                System.out.print("Min Experience Required for Role: ");
                int minExp=sc.nextInt();
                Resume<SoftwareEngineer> resume=new Resume<>(name,exp,new SoftwareEngineer(minExp),skills);
                allResumes.add(resume);
                System.out.println("Resume submitted");
            }
            else if(choice==2){
                System.out.print("Candidate Name: ");
                String name=sc.nextLine();
                System.out.print("Years of Experience: ");
                int exp=sc.nextInt();
                sc.nextLine();
                System.out.print("Skills (comma separated): ");
                String skills=sc.nextLine();
                System.out.print("Min Experience Required for Role: ");
                int minExp=sc.nextInt();
                Resume<DataScientist> resume=new Resume<>(name,exp,new DataScientist(minExp),skills);
                allResumes.add(resume);
                System.out.println("Resume submitted");
            }
            else if(choice==3){
                System.out.print("Candidate Name: ");
                String name=sc.nextLine();
                System.out.print("Years of Experience: ");
                int exp=sc.nextInt();
                sc.nextLine();
                System.out.print("Skills (comma separated): ");
                String skills=sc.nextLine();
                System.out.print("Min Experience Required for Role: ");
                int minExp=sc.nextInt();
                Resume<ProductManager> resume=new Resume<>(name,exp,new ProductManager(minExp),skills);
                allResumes.add(resume);
                System.out.println("Resume submitted");
            }
            else if(choice==4){
                displayAllResumes(allResumes);
            }
            else if(choice==5){
                System.out.println("\n--- Screening Results ---");
                selectedResumes.clear();
                for(Resume<?> resume:allResumes){
                    if(screenResume(resume)){
                        selectedResumes.add(resume);
                    }
                }
                System.out.println("\nTotal Selected: "+selectedResumes.size());
            }
            else if(choice==6){
                System.out.println("\n=== Selected Candidates ===");
                if(selectedResumes.isEmpty()){
                    System.out.println("No candidates selected yet");
                }else{
                    for(int i=0;i<selectedResumes.size();i++){
                        System.out.println((i+1)+". "+selectedResumes.get(i));
                    }
                }
            }
            else if(choice==7){
                System.out.println("Shutting down system...");
                break;
            }
        }
        sc.close();
    }
}
