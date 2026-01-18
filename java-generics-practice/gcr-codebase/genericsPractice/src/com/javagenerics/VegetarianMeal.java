package com.javagenerics;

public class VegetarianMeal implements MealPlan{
    private String name;
    private int calories;
    
    public VegetarianMeal(String name,int calories){
        this.name=name;
        this.calories=calories;
    }
    
    @Override
    public String getMealType(){
        return "Vegetarian";
    }
    
    @Override
    public void displayMealInfo(){
        System.out.println(name+" ("+calories+" cal) - "+getMealType());
    }
    
    public String getName(){return name;}
    public int getCalories(){return calories;}
}
