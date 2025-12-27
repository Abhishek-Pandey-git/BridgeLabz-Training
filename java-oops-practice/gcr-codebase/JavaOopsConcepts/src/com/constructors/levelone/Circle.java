package com.constructors.levelone;

class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0);   // constructor chaining
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();        // uses default radius
        Circle c2 = new Circle(5.5);     // uses user-provided radius

        System.out.println(c1.radius);
        System.out.println(c2.radius);
    }
}
