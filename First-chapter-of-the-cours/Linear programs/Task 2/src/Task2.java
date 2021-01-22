/*
 *   Задание: Вычислить значение выражения по формуле
 *   (все переменные принимают дейсвительные значения):
 *   (b + √(b^2 + 4ac))/2a - a^3 * c + b^-2
 *
 *   Dzmitry Siarheyeu
 *   25.10.2020
 */

import java.util.Scanner;
import static java.lang.Math.*;

public class Task2 {

    public static void main(String[] args) {

        double z, a, b, c;      // объявление переменных

        Scanner in = new Scanner(System.in);        // объявление сканера командной строки

        System.out.println("Solution function: (b+√(b^2+4ac))/2a-a^3c+b^(-2)");     // вывод текста в консоль
        System.out.println("Input a:");
        a = in.nextInt();       // чтение данных из консоли
        System.out.println("Input b:");
        b = in.nextInt();
        System.out.println("Input c:");
        c = in.nextInt();

        z = ((b+sqrt((pow(b,2)+4*a*c)))/2*a)-(pow(a,3)*c)+pow(b,-2);    // вычисление функции

        System.out.println("Result: " + z);     // вывод результата

        in.close();     // закрытие сканера
    }
}
