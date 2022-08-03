package com.tms.olnandtaa1.lesson19.task1;

import static java.lang.Thread.sleep;

public class DemoRunnable1 implements Runnable {
    Thread thread = new Thread();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {

            try {
                sleep(500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
            System.out.println(i);
        }
    }
}

