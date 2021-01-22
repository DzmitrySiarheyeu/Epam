/*
 *  Задание: Вычислить значение функции на отрезке [a, b] с шагом h:
 *  y = x при x > 2 и y = -x при x <= 2
 *
 *  Dzmitry Siarheyeu
 *  25.10.2020
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class Task2 {

    public static void main(String[] args) {

        double a, b, h;                 // объявление переменных

        Scanner in = new Scanner(System.in);        // объявление сканера командной строки

        System.out.println("Calculating the function value on a segment");              // вывод текста в консоль
        System.out.println("Input the segment value: [a, b]:");
        a = in.nextDouble();                                // чтение данных из консоли
        b = in.nextDouble();
        System.out.println("Input a step:");
        h = in.nextDouble();

        while (a<b){                // запуск цикла
            if(a<=2){
            System.out.println("F("+a+") y=-" + a);       // вывод ответ
            }else  System.out.println("F("+a+") y=" + a);       // вывод ответ
            a +=h;
        }

        in.close();     // закрытие сканера
    }
}
