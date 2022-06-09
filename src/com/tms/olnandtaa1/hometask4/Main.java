package com.tms.olnandtaa1.hometask4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ienput a number from one to seven: ");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Light blue");
                break;
            case 6:
                System.out.println("Dark blue");
                break;
            case 7:
                System.out.println("Purple");
                break;
        }
    }
}
