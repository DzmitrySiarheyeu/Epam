/*
 *  Задание: Даны числовой ряд и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид: an = 1 / 2^n + 1 / 3^n
 *
 *  Dzmitry Siarheyeu
 *  17.02.2021
 */

import java.util.Scanner;
import static java.lang.Math.*;

public class Task5 {

    public static void main(String[] args) {

       double sum = 0, n, e, a;         // объявление переменных

        Scanner in = new Scanner(System.in); // объявление сканера командной

        System.out.println("Finding the sum of series members whose modulus is greater than or equal to the given e");  // вывод текста в консоль
        System.out.println("Input e and n:");

        e = in.nextDouble();                    // чтение данных из консоли
        n = in.nextDouble();

        // начало вычисления
        for(int i = 0; i<=n; i++){                  // запуск цикла
            a = (1 / pow(2,i)) + (1 / pow(3, i));
            if(abs(a) >= e){
                sum = sum + a;
            }
        }
        // конец вычисление

        System.out.println(sum);    // вывод результата

        in.close();     // закрытие сканера
    }
}
