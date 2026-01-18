package com.javagenerics;

public class Course<T extends CourseType> {
    private String courseName;
    private String department;
    private int credits;
    private T type;
    
    public Course(String name,String dept,int credits,T type){
        this.courseName=name;
        this.department=dept;
        this.credits=credits;
        this.type=type;
    }
    
    public String getCourseName(){return courseName;}
    public String getDepartment(){return department;}
    public int getCredits(){return credits;}
    public T getType(){return type;}
    
    @Override
    public String toString(){
        return courseName+" | "+department+" | "+credits+" credits | "+type.getEvaluationType();
    }
}
