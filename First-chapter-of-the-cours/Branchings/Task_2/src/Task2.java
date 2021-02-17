/*
 *  Задание: Найти max{min(a, b), min(c, d)}

 *  Dzmitry Siarheyeu
 *  17.02.2020
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class Task2 {

    public static void main(String[] args) {

        int a, b, c, d, max;  // объявление переменных типа целочисленные значения

        Scanner in = new Scanner(System.in);  // объявление сканера командной строки

        System.out.println("Finding the maximum from the minimum");  // вывод текста в консоль
        System.out.println("Input a:");
        a = in.nextInt();                   // чтение данных из консоли типа числа
        System.out.println("Input b:");
        b = in.nextInt();
        System.out.println("Input c:");
        c = in.nextInt();
        System.out.println("Input d:");
        d = in.nextInt();

        max = max(min(a,b), min(c,d)); // вычисление результата

        System.out.println("max{min(a,b), min(c,d)} = " + max); // вывод результата

        in.close();  // закрытие сканера
    }
}
