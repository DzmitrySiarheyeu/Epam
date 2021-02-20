/*
 *   Задание: В массив A[N] занесены натуральные числа.
 *   Найти сумму тех элементов, которые кратны данному K
 *
 *   Dzmitry Siarheyeu
 *   17.02.2021
 */

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int N, K, sum = 0, min = -500;
        int[] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Finding the sum of elements that are multiples of K");
        System.out.println("Input N and K:");

        N = input.nextInt();
        K = input.nextInt();
        array = new int[N];

        System.out.print("Array");

        for(int i = 0 ; i < N ; i++){
            array[i] = min + random.nextInt(1000);
            System.out.print(array[i] + " ");
            if (array[i] % K == 0) {
                sum = sum + array [i];
            }
        }

        System.out.println("\nSum of elements that are multiples of K=" + K + " sum=" + sum );


        input.close();

    }
}
