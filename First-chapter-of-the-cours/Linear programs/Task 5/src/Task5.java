/*
 *   Задание: Дано натуральное число T, которое представляет длительность
 *   прошедшего времени в секундах. Вывести данное значение длительности в
 *   часах, минутах и секундах в следующей форме: HHч MMмин SSс
 *
 *   Dzmitry Siarheyeu
 *   17.02.2021
 */

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        long T, z;      // объявление переменных

        GregorianCalendar calendar = new GregorianCalendar();       // объявление календаря

        Scanner in = new Scanner(System.in);        // объявление сканера командной строки

        System.out.println("Time now: " + new SimpleDateFormat("HHч mmмин ssс").format(calendar.getTimeInMillis())); // вывод текста в консоль
        System.out.println("Add time");
        System.out.println("Input T:");

        T = in.nextLong();      // чтение данных из консоли

        z = calendar.getTimeInMillis()+(T*1000);    // добавление необходимого колличества секкунд

        System.out.println("Result: " + new SimpleDateFormat("HHч mmмин ssс").format(z));       // вывод результата

        in.close();     // закрытие сканера
    }
}
