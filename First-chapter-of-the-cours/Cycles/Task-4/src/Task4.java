/*
 *  Задание: Составить прогруамму нахождения квадратов первых двухсот чисел.
 *
 *  Dzmitry Siarheyeu
 *  17.02.2021
 */

import java.math.BigInteger;
import static java.lang.Math.pow;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Product of the first two hundred square numbers");      // вывод текста в консоль

        BigInteger s = BigInteger.valueOf(1);  // объявление переменных

        for(int i = 2; i<=200; i++){                                // запуск цикла
            s = s.multiply(BigInteger.valueOf((long)pow(i,2)));     // вычисление значения
        }

        System.out.println("Result: " + s);  // вывод результата
    }
}
