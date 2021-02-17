/*
 *   адание: Вычислить значение выражения по формуле
 *   (все переменные принимают дейсвительные значения):
 *   (sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(xy)
 *
 *   Dzmitry Siarheyeu
 *   17.02.2021
 */

import java.util.Scanner;

import static java.lang.Math.*;

public class Task3 {

    public static void main(String[] args) {

        double z, x, y;     // объявление переменных

        Scanner in = new Scanner(System.in);        // объявление сканера командной строки

        System.out.println("Solution function: (sin x + cos y)/cos x - sin y) * tg xy");        // вывод текста в консоль
        System.out.println("Input x:");
        x = in.nextDouble();        // чтение данных из консоли
        System.out.println("Input y:");
        y = in.nextDouble();

        z = ((sin(x) + cos(y))/(cos(x)-sin(y)))*tan(x*y); // вычисление функции

        System.out.println("Result: " + String.format("%.2f", z).replace(',', '.'));        // вывод результата

        in.close();         // закрытие сканера
    }
}
