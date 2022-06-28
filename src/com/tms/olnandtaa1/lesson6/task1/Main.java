package com.tms.olnandtaa1.lesson6.task1;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("1111 1111 1111 1111", 100);
        CreditCard creditCard2 = new CreditCard("2222 2222 2222 2222", 200);
        CreditCard creditCard3 = new CreditCard("3333 3333 3333 3333", 300);
        creditCard.addAmount(50);
        creditCard2.addAmount(100);
        creditCard3.withdrawAmount(150);
        System.out.println(creditCard);
        System.out.println(creditCard2);
        System.out.println(creditCard3);

    }
}
