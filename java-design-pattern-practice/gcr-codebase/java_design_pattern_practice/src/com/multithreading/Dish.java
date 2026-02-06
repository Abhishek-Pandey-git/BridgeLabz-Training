package com.multithreading;

class Dish {

    private final String name;
    private final long cookTimeMillis;

    public Dish(String name, double cookTimeSeconds) {
        this.name = name;
        this.cookTimeMillis = (long) (cookTimeSeconds * 1000);
    }

    public String getName() {
        return name;
    }

    public long getCookTimeMillis() {
        return cookTimeMillis;
    }
}
