package com.tms.olnandtaa1.hometask2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int i = sc.nextInt();
        if (i % 2 == 0)
        {
            System.out.println("It's an even number");
        }
        else {
            System.out.println("It's an odd number");
        }
    }
}
