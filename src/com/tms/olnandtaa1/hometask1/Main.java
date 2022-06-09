package com.tms.olnandtaa1.hometask1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number from one to twelve: ");
        int i = sc.nextInt();
        switch (i) {
            case 1, 2, 12:
                System.out.println("It's winter");
                break;
            case 3, 4, 5:
                System.out.println("It's spring");
                break;
            case 6, 7, 8:
                System.out.println("It's summer");
                break;
            case 9, 10, 11:
                System.out.println("It's autumn");
                break;
        }
    }
}
