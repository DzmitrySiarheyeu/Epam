/*
 *  Задание: Найти сумму квадратов первых ста чисел
 *
 *  Dzmitry Siarheyeu
 *  25.10.2020
 */

import static java.lang.Math.pow;

public class Task3 {

    public static void main(String[] args) {

       double x = 0;            // объявление переменных

        System.out.println("Sum of squares of the first hundred numbers");  // вывод текста в консоль

        for(int i = 1; i <= 100; i++){  // запуск цикла
            x += pow(i,2);
        }
        
        System.out.println("Result: " + x); // вывод результата

    }
}
