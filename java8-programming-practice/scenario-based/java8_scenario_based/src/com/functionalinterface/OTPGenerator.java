package com.functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class OTPGenerator {
    public static void main(String[] args) {
        // Supplier to generate OTP
        Supplier<Integer> generateOTP = () -> 100000 + new Random().nextInt(900000);
        
        System.out.println("OTP 1: " + generateOTP.get());
        System.out.println("OTP 2: " + generateOTP.get());
        System.out.println("OTP 3: " + generateOTP.get());
    }
}
