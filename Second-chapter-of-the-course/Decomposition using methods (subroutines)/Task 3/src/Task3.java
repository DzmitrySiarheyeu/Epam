import java.util.Scanner;
import static java.lang.Math.*;

public class Task3 {

    public static void main(String[] args) {

        int a, s;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculating the area of a regular hexagon with side a using the triangle area calculation method");

        System.out.println("Input a: ");

        a = input.nextInt();

        System.out.printf("The area of a hexagon with sides %d is equal to %4.2f", a, 6 * area(a));

        input.close();

    }

    private static double area(int a) {
        return (0.5 * pow(a, 2) * sin(toRadians(120)));
    }
}
