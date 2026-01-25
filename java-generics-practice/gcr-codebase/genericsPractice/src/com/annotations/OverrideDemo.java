package com.annotations;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        
        Dog dog = new Dog();
        dog.makeSound();
        
        Animal animalDog = new Dog();
        animalDog.makeSound();
    }
}
