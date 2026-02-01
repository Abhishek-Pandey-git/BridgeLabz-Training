package com.functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class DiscountCouponGenerator {
    public static void main(String[] args) {
        // Supplier to generate random discount coupon
        Supplier<String> generateCoupon = () -> {
            String[] coupons = {"SAVE10", "FLAT20", "DISCOUNT15", "OFFER25", "MEGA30"};
            return coupons[new Random().nextInt(coupons.length)];
        };
        
        System.out.println("Coupon 1: " + generateCoupon.get());
        System.out.println("Coupon 2: " + generateCoupon.get());
        System.out.println("Coupon 3: " + generateCoupon.get());
    }
}
