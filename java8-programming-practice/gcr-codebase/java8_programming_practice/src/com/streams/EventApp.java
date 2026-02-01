package com.streams;

import java.util.ArrayList;
import java.util.List;

public class EventApp {

    public static void main(String[] args) {

        List<String> attendees = new ArrayList<>();

        // Adding attendees
        attendees.add("Abhishek");
        attendees.add("Rohit");
        attendees.add("Neha");
        attendees.add("Priya");
        attendees.add("Amit");

        // Using forEach() with lambda to print welcome message
        attendees.forEach(name ->
            System.out.println("Welcome to the event, " + name + "!")
        );
    }
}

