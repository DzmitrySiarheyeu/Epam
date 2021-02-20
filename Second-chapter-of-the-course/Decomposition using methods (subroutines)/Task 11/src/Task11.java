/*
 *   Задание: Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 *
 *   Dzmitry Siarheyeu
 *   20.02.2021
 */

import java.util.Scanner;
import static java.lang.Math.*;

public class Task11 {

    public static void main(String[] args) {

        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("A comparison of two numbers");
        System.out.println("Input a and b: ");

        a = input.nextInt();
        b = input.nextInt();

        if(compNum(a, b) == 0) {
            System.out.print("The number of digits in the numbers is the same");
        }else System.out.print("There are more digits in the number " + compNum(a, b));

        input.close();
    }

    private static int compNum(int a, int b) {
        if(log10(a)+1 > log10(b)+1) return a;
        else if (log10(a)+1 == log10(b)+1) return 0;
        return b;
    }
}
