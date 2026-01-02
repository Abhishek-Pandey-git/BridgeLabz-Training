package com.inheritence.multilevelinheritence;

// PaidOnlineCourse adds fee and discount
public class PaidOnlineCourse extends OnlineCourse {
    protected double fee;
    protected double discount; // simple percentage like 10 for 10%

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalFee() {
        return fee - (fee * discount / 100.0);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: " + getFinalFee());
    }
}
