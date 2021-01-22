/*
 *   Задание: Дано действительное число R вида nnn.ddd
 *   (три цфровых разряда в дробной и целой частях).
 *   Поменять местами дробную и целую части числа и
 *   вывести полученное значение числа
 *
 *   Dzmitry Siarheyeu
 *   25.10.2020
 */

import java.util.Scanner;

import static java.lang.Math.*;

public class Task4 {

    public static void main(String[] args) {

        String str;     // объявление переменных
        float R, z;     // объявление переменных
        int i;          // объявление переменных

        Scanner in = new Scanner(System.in);     // объявление сканера командной строки

        System.out.println("Number inversion");          // вывод текста в консоль
        System.out.println("Input R:");
        str = in.next();        // чтение данных из консоли

        R = Float.parseFloat(str);
        i=(int)R;


        z = ((float) i/1000)+(int)((R-i)*1000);     // вычисление функции

        System.out.println("Result: " + String.format("%3.3f", z).replace(',', '.'));       // вывод результата

        in.close();     // закрытие сканера
    }
}
