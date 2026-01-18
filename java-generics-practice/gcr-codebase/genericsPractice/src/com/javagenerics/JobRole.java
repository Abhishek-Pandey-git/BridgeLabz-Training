package com.javagenerics;

public abstract class JobRole {
    private String roleName;
    private int experienceRequired;
    
    public JobRole(String name,int exp){
        this.roleName=name;
        this.experienceRequired=exp;
    }
    
    public String getRoleName(){return roleName;}
    public int getExperienceRequired(){return experienceRequired;}
}
