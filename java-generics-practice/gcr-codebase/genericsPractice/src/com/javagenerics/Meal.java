package com.javagenerics;

public class Meal<T extends MealPlan> {
    private T mealPlan;
    private String dayOfWeek;
    
    public Meal(T mealPlan,String day){
        this.mealPlan=mealPlan;
        this.dayOfWeek=day;
    }
    
    public T getMealPlan(){return mealPlan;}
    public String getDayOfWeek(){return dayOfWeek;}
    
    public void display(){
        System.out.print(dayOfWeek+" - ");
        mealPlan.displayMealInfo();
    }
}
