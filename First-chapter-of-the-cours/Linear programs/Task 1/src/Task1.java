/*
 *   Задание: Найти значение функции: z = ((a - 3) * b/2) + c.
 *
 *   Dzmitry Siarheyeu
 *   17.02.2021
 */

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int z, a, b, c;     // объявление переменных

        Scanner in = new Scanner(System.in);        // объявление сканера командной строки

        System.out.println("Solution function: z = ((a-3)*b/2)+c");     // вывод текста в консоль
        System.out.println("Input a:");
        a = in.nextInt();       // чтение данных из консоли
        System.out.println("Input b:");
        b = in.nextInt();
        System.out.println("Input c:");
        c = in.nextInt();

        z = ((a - 3) * b / 2) + c;      // вычисление функции

        System.out.println("Result z = " + z);      // вывод результата

        in.close();     // закрытие сканера
    }
}
