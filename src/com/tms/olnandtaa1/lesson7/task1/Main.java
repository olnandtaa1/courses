package com.tms.olnandtaa1.lesson7.task1;


public class Main {
    public static void main(String[] args) {
        double summary = 0;
        Figures[] array = new Figures[]{new Triangle(10, 6, 8),
                new Rectangle(5, 4),
                new Circle(6),
                new Rectangle(8, 9),
                new Triangle(12, 14, 8)};
        for (int i = 0; i < array.length; i++) {
            summary += array[i].calculatePerimeter();
        }
        System.out.println(summary);
    }


}

