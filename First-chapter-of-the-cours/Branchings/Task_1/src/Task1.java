/*
 *   Задание: Даны два угла треугольника (в градусах).
 *   Определить, существует ли такой треугольник, и ессли да,
 *   то будет ли он прямоугольным.
 *
 *   Dzmitry Siarheyeu
 *   17.02.2021
*/

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int a, b, c;   // объявление переменных типа целочисленные значения

        Scanner in = new Scanner(System.in); // объявление сканера командной строки

        System.out.println("Determining the existence of a triangle"); // вывод текста в консоль
        System.out.println("Input the first corner:");
        a = in.nextInt();                                   // чтение данных из консоли типа числа
        System.out.println("Input the second corner:");
        b = in.nextInt();

        c = 180 - a - b; // нахождение 3 угла

        if(c>0) {                                                           // условный оператор сравнения
            System.out.println("Corner = " + c);
            if(a==90 || b == 90 || c == 90){
                System.out.println("The triangle is rectangular");
            }else System.out.println("The triangle is not rectangular");
        }else System.out.println("There is no such triangle");

        in.close(); // закрытие сканера
    }
}
