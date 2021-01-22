/*
 *   Задание: Задан размер A, B прямугольного отверстия и размеры x, y, z кирпича.
 *   Определить, пройдет ли кирпич через отверстие.
 *
 *   Dzmitry Siarheyeu
 *   25.10.2020
*/

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        double A, B, x, y, z;  // объявление переменных типа значения с плавающей точкой

        Scanner in = new Scanner(System.in);    // объявление сканера командной строки

        System.out.println("Passing an object through a hole");  // вывод текста в консоль
        System.out.println("Input hole size, A and B:");
        A = in.nextDouble();                         // чтение данных из консоли
        B = in.nextDouble();
        System.out.println("Input brick size x, y, z:");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();

        // начало вывода ответа
        System.out.print("Brick with dimensions " + x + "x" + y + "x" + z);

        if((A>=x && B>=y) || (A>=x && B>=z) || (A>=y && B>=x) || (A>=y && B>=z) || (A>=z && B>=x) || (A>=z && B>=y)){
            System.out.print(" will pass through a hole ");
        }else{
            System.out.print(" won't pass through the hole ");
        }

        System.out.println("of size AxB " + A + "x" + B);
        // конец вывода ответа

        in.close();     // закрытие сканера
    }
}
