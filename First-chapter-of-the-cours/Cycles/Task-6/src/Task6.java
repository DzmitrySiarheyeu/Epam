/*
 *   Задание: вывести на экран соответствий между символами
 *   и их численными обозначениями в памяти компьютера
 *
 *   Dzmitry Siarheyeu
 *   25.10.2020
 */

import java.util.Scanner;

public class Task6 {


    public static void main(String[] args) {

        int num, span;              // объявление переменных типа значения с плавающей точкой

        Scanner in = new Scanner(System.in);        // объявление сканера командной

        System.out.println("Output of symbols and their numerical designations in the computer memory");    // вывод текста в консоль
        System.out.println("Input the character number span:");

        num = in.nextInt();                 // чтение данных из консоли
        span = in.nextInt();

        spanSymbolsOutput(num, span);       // выполнение функция

        in.close();     // закрытие сканера
    }

    // начало функции вывода символов комьютера
    private static void spanSymbolsOutput(int number, int spans) {

        System.out.print("ASCII symbols and their numerical designations:\n № symbols OCT  HEX\n");

        for(int i = number; i <= spans; i++){
            System.out.printf("%03d %3s %5s %4s%n", i, (char)i, Integer.toOctalString(i), Integer.toHexString(i)); // вывод результата
        }
    }
    // конец функции
}
