import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Hello world");
        }
        System.out.print("Введите username: ");
        Scanner sc = new Scanner(System.in);
       String a1 = sc.nextLine();
        System.out.println("Hello " + a1);


        int a, b;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Введите числа a и b: ");
        if (sc1.hasNextInt() && (sc2.hasNextInt()))
        {
            a = sc1.nextInt();
            b = sc2.nextInt();
            int c = a + b;
            System.out.println("Значение выражения a + b = " + c);
            int d = a - b;
            System.out.println("Значение выражения a - b = " + d);
        }
        else {
            System.out.print("Пожалуйста, повторите попытку");
        }
    }
}





