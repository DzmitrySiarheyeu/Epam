/*
 *   Задание: Для каждного натурального числа в промежутке от m до n
 *   вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
 *
 *   Dzmitry Siarheyeu
 *   25.10.2020
 */

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        int m, n;               // объявление переменных

        Scanner in = new Scanner(System.in);        // объявление сканера командной строки

        System.out.println("Divisors for natural numbers from m to n \n Input m and n");        // вывод текста в консоль

        m = in.nextInt();       // чтение данных из консоли
        n = in.nextInt();

        // начало вычисления функции
        for(int i = m; i<=n; i++){
            System.out.print("\n Divisors for " + i +" = ");
            int count = 0;
            for(int j=i;j>1;j--){
                int b=i%j;
                if(i != j && b==0){
                    System.out.print(j + ", ");
                    count++;
                }

            }
            if(count == 0){
                System.out.print("null");
            }

        }
        // конец вычисления функции

        in.close();     // закрытие сканера
    }
}
