package com.tms.olnandtaa1.hometask3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the temperature today?");
        int i = sc.nextInt();
        if (i > -5) {
            System.out.println("It's warm");
        } else if (i <= -5 && i > -20) {
            System.out.println("It's okay");
        } else if (i <= -20) {
            System.out.println("It's cold");
        }
    }
}
