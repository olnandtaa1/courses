import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.print("Введите значение a = ");
        Scanner sc1 = new Scanner(System.in);
        double a = sc1.nextDouble();
        System.out.print("Введите значение b = ");
        double b = sc1.nextDouble();
        System.out.print("Введите значение c = ");
        double c = sc1.nextDouble();
        double d = (Math.pow(b,2) - (4 * a * c));
        System.out.println("Значение дискриминанта равно " + d);
        double x1, x2;

        if (d>0)
        {
            x1 = ((-b) + Math.sqrt(d)) / (2 * a);
            x2 = ((-b) - Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: " + x1 + ", " + x2);
        }
        else if (d==0)
        {
            x1 = (-b) / (2 * a);
            System.out.println("Корень уравнения = " + x1);
        }
        else
            System.out.println("Нет корней");



    }
}
