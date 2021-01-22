import java.util.Scanner;

import static java.lang.Math.*;

public class Task9 {

    public static void main(String[] args) {

        double X, Y, Z, T, area;

        Scanner input = new Scanner(System.in);

        System.out.println("Search for the area of a quadrilateral");
        System.out.print("Input X, Y, Z, T: ");

        X = input.nextDouble();
        Y = input.nextDouble();
        Z = input.nextDouble();
        T = input.nextDouble();

        area = findAreaQuad(X, Y, Z, T);

        System.out.println("The area of a quadrilateral " + area);

        input.close();

    }

    private static double findAreaQuad(double x, double y, double z, double t) {
        double d;
        d = findDiagonal(x, y);

        return (x * y * 0.5) + 0.25*sqrt((d+z+t)*(d+z-t)*(d+t-z)*(z+t-d));
    }

    private static double findDiagonal(double x, double y) {
        return sqrt(pow(x, 2) + pow(y, 2));
    }
}
