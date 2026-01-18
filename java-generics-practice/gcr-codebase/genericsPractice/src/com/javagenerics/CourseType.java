package com.javagenerics;

public abstract class CourseType {
    private String evaluationType;
    
    public CourseType(String type){
        this.evaluationType=type;
    }
    
    public String getEvaluationType(){
        return evaluationType;
    }
}
