package com.multithreading;

public class KitchenManager {

    public static void main(String[] args) throws InterruptedException {

        Dish pizza = new Dish("Pizza", 3.0);
        Dish pasta = new Dish("Pasta", 2.0);
        Dish salad = new Dish("Salad", 1.0);
        Dish burger = new Dish("Burger", 2.5);

        Chef chef1 = new Chef("Chef-1", pizza);
        Chef chef2 = new Chef("Chef-2", pasta);
        Chef chef3 = new Chef("Chef-3", salad);
        Chef chef4 = new Chef("Chef-4", burger);

        chef1.start();
        chef2.start();
        chef3.start();
        chef4.start();

        // Manager waits for all chefs
        chef1.join();
        chef2.join();
        chef3.join();
        chef4.join();

        System.out.println("Kitchen closed - All orders completed");
    }
}
