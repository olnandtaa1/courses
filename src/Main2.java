import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.print("Введите значение a = ");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.print("Введите значение b = ");
       // Scanner sc2 = new Scanner(System.in);
        int b = sc1.nextInt();
        System.out.print("Введите значение c = ");
       // Scanner sc3 = new Scanner(System.in);
        int c = sc1.nextInt();
        int b1 = 2;
        double d = (Math.pow (b, b1) - (4 * a * c));
        System.out.println("Значение дискриминанта равно " + d);


    }
}
