/*
 * Задание: Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 *
 * Dzmitry Siarheyeu
 * 25.10.2020
*/

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int x, z = 0;       // объявление переменных

        Scanner in = new Scanner(System.in);        // объявление сканера командной строки

        System.out.println("Sum of natural numbers from 1 to x");           // вывод текста в консоль
        System.out.println("Input x:");
        x = in.nextInt();                   // чтение данных из консоли

        for(int i = 1; i <= x; i++){     // объявление цикла
            z = z + i;                  // вычисления
        }

        System.out.println("Result: " + z); // вывод результата

        in.close();     // закрытие сканера
    }
}
