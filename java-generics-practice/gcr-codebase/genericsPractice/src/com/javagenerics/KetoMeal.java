package com.javagenerics;

public class KetoMeal implements MealPlan{
    private String name;
    private int calories;
    
    public KetoMeal(String name,int calories){
        this.name=name;
        this.calories=calories;
    }
    
    @Override
    public String getMealType(){
        return "Keto";
    }
    
    @Override
    public void displayMealInfo(){
        System.out.println(name+" ("+calories+" cal) - "+getMealType());
    }
    
    public String getName(){return name;}
    public int getCalories(){return calories;}
}
