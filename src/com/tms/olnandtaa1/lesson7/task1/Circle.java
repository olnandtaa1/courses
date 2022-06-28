package com.tms.olnandtaa1.lesson7.task1;

public class Circle implements Figures {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
