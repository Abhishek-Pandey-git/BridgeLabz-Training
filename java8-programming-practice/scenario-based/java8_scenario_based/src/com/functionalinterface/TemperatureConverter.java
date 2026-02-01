package com.functionalinterface;

import java.util.function.Function;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Function to convert Celsius to Fahrenheit
        Function<Double, Double> celsiusToFahrenheit = celsius -> (celsius * 9/5) + 32;
        
        System.out.println("0°C = " + celsiusToFahrenheit.apply(0.0) + "°F");
        System.out.println("25°C = " + celsiusToFahrenheit.apply(25.0) + "°F");
        System.out.println("100°C = " + celsiusToFahrenheit.apply(100.0) + "°F");
    }
}
