package com.inheritence.assistedproblems;

// Cat class extends Animal
public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says Meow!");
    }
}