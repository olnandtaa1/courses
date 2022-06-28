package com.tms.olnandtaa1.lesson7.task1;

public class Triangle implements Figures {

    private double x;
    private double y;
    private double z;

    public Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(calculatePerimeter() / 2 * (calculatePerimeter() / 2 - x) * (calculatePerimeter() / 2 - y) * (calculatePerimeter() / 2 - z));
    }

    @Override
    public double calculatePerimeter() {
        return x + y + z;
    }
}
