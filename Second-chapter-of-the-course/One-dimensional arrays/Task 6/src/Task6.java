/*
 *   Задание: Задана последовательность N вещественных чисел. Вычислить сумму чисел,
 *   порядковые номера которых являются простыми числами
 *
 *   Dzmitry Siarheyeu
 *   01.11.2020
 */

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task6 {

    public static void main(String[] args) {

        int n, sum=0;
        int[] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Calculating the sum of numbers whose ordinal numbers are Prime numbers");
        System.out.println("Input n:");

        n = input.nextInt();

        array = new int[n];

        System.out.print("Array: ");

        for(int i = 0 ; i < n ; i++){
            array[i] = random.nextInt(1000);
            System.out.print(array[i] + " ");
            if (chek(i+1) && i > 0) {
                sum += array[i];
            }
        }

        System.out.print("\nThe sum of the numbers: " + sum);

        input.close();

    }

    public static boolean chek(int x) {
        for (int i=2; i<=x/2; i++) {
            int temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}
