/*
 *   Задание: Даны два числа. Определить цифры, входящие в запись
 *   как первого так и второго числа
 *
 *   Dzmitry Siarheyeu
 *   25.10.2020
 */

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        String[] input = new String[2];     // объявление переменных

        int[]   a = new int[256],
                b = new int[256],
                c = new int[255];           // объявление переменных

        int count1 = 0,                     // объявление переменных
            count2 = 0,
            count3 = 0,
            inp1,
            inp2;

        Scanner in = new Scanner(System.in);    // объявление сканера командной строки

        System.out.println("Search for identical digits in numbers");       // вывод текста в консоль
        System.out.println("Input a and b:");

        input[0] = in.next();       // чтение данных из консоли
        input[1] = in.next();

        inp1 = Integer.parseInt(input[0]);
        inp2 = Integer.parseInt(input[1]);

        // начало функия разделение первого числа на цифры
        while (inp1>0){             // начало цикла
            a[count1] = inp1 % 10;
            inp1 = inp1 / 10;
            count1++;
        }
        // конец функия разделение первого числа на цифры

        // начало функия разделение второго числа на цифры
        while (inp2>0){
            b[count2] = inp2 % 10;
            inp2 = inp2 / 10;
            count2++;
        }
        // конец функия разделение второго числа на цифры


        // начало функции поиска одинаковых цифер
        for(int i = 0; i<10; i++){
            for(int j = 0; j<count1; j++){
                for(int k = 0; k<count2; k++){
                    if(a[j] == b[k] && a[j] == i && b[k] == i){
                        count3++;

                        if(c[count3-1] == i){
                            count3--;
                        }else {
                            c[count3-1] = i;
                            break;
                        }
                    }
                }
            }
        }
        // конец функции поиска одинаковых цифер

        
        // вывод результатов
        if(count3 == 0){
            System.out.println("The numbers do not contain the same digits");
        }else {
            System.out.print("The numbers contain the same digits: ");

            for(int i = 0; i<count3; i++){
                System.out.print(c[i] + " ");
            }

        }
        // конец вывода результатов

        in.close();     // закрытие сканера
    }
}
