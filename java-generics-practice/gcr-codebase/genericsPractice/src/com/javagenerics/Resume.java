package com.javagenerics;

public class Resume<T extends JobRole> {
    private String candidateName;
    private int yearsOfExperience;
    private T jobRole;
    private String skills;
    
    public Resume(String name,int exp,T role,String skills){
        this.candidateName=name;
        this.yearsOfExperience=exp;
        this.jobRole=role;
        this.skills=skills;
    }
    
    public String getCandidateName(){return candidateName;}
    public int getYearsOfExperience(){return yearsOfExperience;}
    public T getJobRole(){return jobRole;}
    public String getSkills(){return skills;}
    
    @Override
    public String toString(){
        return candidateName+" | "+jobRole.getRoleName()+" | "+yearsOfExperience+" years | Skills: "+skills;
    }
}
