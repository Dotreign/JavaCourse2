import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextInt();
        float b = scanner.nextInt();
        float c = scanner.nextInt();

        double disc = Math.pow(b, 2) - 4*a*c;
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("Решений бесконечно много");
                } else {
                    System.out.println("Решений нет");
                }
            } else {
                System.out.format("Решение одно: x = %.2f", -c/b);
            }
        } else if(disc < 0){
            System.out.println("Решений нет");
        } else if(disc == 0){
            System.out.format("Решение одно: x = %.2f", -b / (2 * a));
        } else if(disc > 0){
            double a1 = (-b + Math.sqrt(disc)) / (2 * a);
            double a2 = (-b - Math.sqrt(disc)) / (2 * a);
            double x1 = Math.max(a2, a1);
            double x2 = Math.min(a2, a1);
            System.out.format("Два решения: x1 = %.2f, x2 = %.2f", x2, x1);
        } else {
            System.out.println("Решений нет");
        }
    }
}
