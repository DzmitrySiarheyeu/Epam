/*
 *  Задание: Даны три точки А(х1, у1), B(х2, у2) и C(х3, у3).
 *  Определить, будут ли они расположены на одной прямой.
 *
 *  Dzmitry Siarheyeu
 *  17.02.2021
*/

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        double x1, x2, x3, y1, y2, y3;  // объявление переменных типа значения с плавающей точкой

        Scanner in = new Scanner(System.in);  // объявление сканера командной строки

        System.out.println("Determination of finding points on one straight");  // вывод текста в консоль
        System.out.println("Input point A(x,y)");
        x1 = in.nextDouble();                   // чтение данных из консоли
        y1 = in.nextDouble();
        System.out.println("Input point B(x,y)");
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        System.out.println("Input point C(x,y)");
        x3 = in.nextDouble();
        y3 = in.nextDouble();

        // начало вывода ответа
            System.out.print("Points: A(" + x1 + "," + y1 +"), B(" + x2 + "," + y2 +"), C(" + x3 +"," + y3 + ") ");

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
            System.out.println("are on the same straight line");
        }else System.out.println("are not on one straight line");
        // конец вывода ответа

        in.close();     // закрытие сканера
    }
}
