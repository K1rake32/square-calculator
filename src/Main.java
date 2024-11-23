
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double result = 0;
        double result2 = 0;

        System.out.println("Введите аргумент a");
            int a = scanner.nextInt();

        System.out.println("Введите аргумент b");
            int b = scanner.nextInt();

        System.out.println("Введите аргумент c");
            int c = scanner.nextInt();


            if (a == 0) {

                result = (double) (c * (-1)) / b;
                System.out.println(result);
                return;

            }

        if (b == 0) {

            double megResult = (double) (c * (-1)) / a;

            if (megResult < 0) {

                System.out.println("Нет решений");
                return;

            }

            result = Math.sqrt(megResult);
            result2 = -result;

            System.out.println(result);
            System.out.println(result2);

            return;

        }

            if (c == 0) {

                result = 0;
                result2 = (double) (b * (-1)) / a;

                System.out.println(result);
                System.out.println(result2);

                return;

            }

            double discriminant = b * b - 4 * a * c;

        if (discriminant == 0) {

                result = (b * (-1) - Math.sqrt(discriminant)) / (2 * a);

                System.out.println(result);

            }

            if (discriminant > 0) {

                result = (b * (-1) + Math.sqrt(discriminant)) / (2 * a);
                result2 = (b * (-1) - Math.sqrt(discriminant)) / (2 * a);

                System.out.println(result);
                System.out.println(result2);

            }

            if (discriminant < 0) {

                System.out.println("Нет решений");

            }

    }
}