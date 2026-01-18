package com.javagenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MealPlanGenerator {
    
    //generic method to validate
    public static <T extends MealPlan> boolean validateMealPlan(Meal<T> meal){
        if(meal.getMealPlan()==null){
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Meal<?>> weeklyPlan=new ArrayList<>();
        
        while(true){
            System.out.println("\n--- Meal Plan Generator ---");
            System.out.println("1. Add Vegetarian Meal");
            System.out.println("2. Add Vegan Meal");
            System.out.println("3. Add Keto Meal");
            System.out.println("4. Add High-Protein Meal");
            System.out.println("5. View Meal Plan");
            System.out.println("6. Exit");
            System.out.print("Enter option: ");
            
            int opt=sc.nextInt();
            sc.nextLine();
            
            if(opt==1){
                System.out.print("Meal name: ");
                String name=sc.nextLine();
                System.out.print("Calories: ");
                int cal=sc.nextInt();
                sc.nextLine();
                System.out.print("Day of week: ");
                String day=sc.nextLine();
                Meal<VegetarianMeal> meal=new Meal<>(new VegetarianMeal(name,cal),day);
                if(validateMealPlan(meal)){
                    weeklyPlan.add(meal);
                    System.out.println("Meal added!");
                }
            }
            else if(opt==2){
                System.out.print("Meal name: ");
                String name=sc.nextLine();
                System.out.print("Calories: ");
                int cal=sc.nextInt();
                sc.nextLine();
                System.out.print("Day of week: ");
                String day=sc.nextLine();
                Meal<VeganMeal> meal=new Meal<>(new VeganMeal(name,cal),day);
                if(validateMealPlan(meal)){
                    weeklyPlan.add(meal);
                    System.out.println("Meal added!");
                }
            }
            else if(opt==3){
                System.out.print("Meal name: ");
                String name=sc.nextLine();
                System.out.print("Calories: ");
                int cal=sc.nextInt();
                sc.nextLine();
                System.out.print("Day of week: ");
                String day=sc.nextLine();
                Meal<KetoMeal> meal=new Meal<>(new KetoMeal(name,cal),day);
                if(validateMealPlan(meal)){
                    weeklyPlan.add(meal);
                    System.out.println("Meal added!");
                }
            }
            else if(opt==4){
                System.out.print("Meal name: ");
                String name=sc.nextLine();
                System.out.print("Calories: ");
                int cal=sc.nextInt();
                sc.nextLine();
                System.out.print("Day of week: ");
                String day=sc.nextLine();
                Meal<HighProteinMeal> meal=new Meal<>(new HighProteinMeal(name,cal),day);
                if(validateMealPlan(meal)){
                    weeklyPlan.add(meal);
                    System.out.println("Meal added!");
                }
            }
            else if(opt==5){
                System.out.println("\n=== Weekly Meal Plan ===");
                if(weeklyPlan.isEmpty()){
                    System.out.println("No meals planned yet");
                }else{
                    for(Meal<?> m:weeklyPlan){
                        m.display();
                    }
                }
            }
            else if(opt==6){
                System.out.println("Goodbye!");
                break;
            }
        }
        sc.close();
    }
}
