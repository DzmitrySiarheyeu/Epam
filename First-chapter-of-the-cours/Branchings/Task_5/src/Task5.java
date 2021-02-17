/*
 *   Задание: Вычислить значение функции:
 *   F(x) = x^2 - 3x + 9, если x <= 3 и F(x) = 1/(x^3 + 6), если x>3
 *
 *   Dzmitry Siarheyeu
 *   17.02.2021
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class Task5 {


    public static void main(String[] args) {

        double F, x;    // объявление переменных типа значения с плавающей точкой

        Scanner in = new Scanner(System.in);        // объявление сканера командной строки

        System.out.println("The calculation of the function: F(x)=x^2 - 3x + 9 if x<=3 and F(x)=1/(x^3 + 6)");      // вывод текста в консоль
        System.out.println("Input x:");
        x = in.nextDouble();            // чтение данных из консоли

        // начало вычисления функции
        if(x<=3) {
            F = pow(x, 2) - 3 * x + 9;
        }else F = 1 / (pow(x, 3) + 6);
        // конец вычисления функции

        System.out.println("Result: F(x)=" + F ); // вывод ответа

        in.close();     // закрытие сканера
    }
}
