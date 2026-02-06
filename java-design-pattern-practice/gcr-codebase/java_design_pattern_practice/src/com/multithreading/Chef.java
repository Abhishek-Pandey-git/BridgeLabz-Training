package com.multithreading;

class Chef extends Thread {

    private final Dish dish;

    public Chef(String name, Dish dish) {
        super(name);
        this.dish = dish;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started preparing " + dish.getName());

        int[] progress = {25, 50, 75, 100};

        for (int p : progress) {
            try {
                Thread.sleep(dish.getCookTimeMillis() / 4);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println(getName() + " preparing " +
                    dish.getName() + ": " + p + "% complete");
        }

        System.out.println(getName() + " finished preparing " + dish.getName());
    }
}

