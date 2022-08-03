package com.tms.olnandtaa1.lesson19.task1;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        DemoRunnable1 demoRunnable = new DemoRunnable1();
        Thread thread1 = new Thread(demoRunnable);
        Thread thread2 = new Thread(demoRunnable);
        Thread thread3 = new Thread(demoRunnable);
        thread3.start();
        thread3.join();
        thread2.start();
        thread2.join();
        thread1.start();
    }
}
