package Singleton;

public class Singleton {
    private static Singleton instance;

    Singleton() {
        System.out.println("1st singleton");
    }

    public static Singleton getInstance() {
        if (instance == null) {

            instance = new Singleton();
        }

        return instance;
    }
}
