import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");


        //System.out.print("Введите число a = ");


        //System.out.print("Введите число b = ");

        // int c = a + b;
        //  int d = a - b;


        int a, b;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите число a = ");
       // a = sc1.nextInt();
        //Scanner sc2 = new Scanner(System.in);
        System.out.print("Введите число b = ");
        // b = sc1.nextInt();

        if (sc1.hasNextInt()) {
            a = sc1.nextInt();
            b = sc1.nextInt();

            int c = a + b;
            System.out.println("Значение выражения a + b = " + c);
            int d = a - b;
            System.out.println("Значение выражения a - b = " + d);

        } else
            System.out.print("Пожалуйста, повторите попытку");
    }
}





