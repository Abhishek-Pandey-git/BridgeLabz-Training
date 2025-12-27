package com.constructors.levelone;

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    // Setter
    public void setCGPA(double c) {
        cgpa = c;
    }

    // Getter
    public double getCGPA() {
        return cgpa;
    }
}

public class PostGraduateStudent extends Student {

    void show() {
        System.out.println(rollNumber); // public
        System.out.println(name);       // protected
        System.out.println(getCGPA());  // private via method
    }

    public static void main(String[] args) {
        PostGraduateStudent p = new PostGraduateStudent();
        p.rollNumber = 1;
        p.name = "Student A";
        p.setCGPA(8.5);

        p.show();
    }
}

