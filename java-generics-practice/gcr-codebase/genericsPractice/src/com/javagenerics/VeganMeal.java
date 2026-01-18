package com.javagenerics;

public class VeganMeal implements MealPlan{
    private String name;
    private int calories;
    
    public VeganMeal(String name,int calories){
        this.name=name;
        this.calories=calories;
    }
    
    @Override
    public String getMealType(){
        return "Vegan";
    }
    
    @Override
    public void displayMealInfo(){
        System.out.println(name+" ("+calories+" cal) - "+getMealType());
    }
    
    public String getName(){return name;}
    public int getCalories(){return calories;}
}
