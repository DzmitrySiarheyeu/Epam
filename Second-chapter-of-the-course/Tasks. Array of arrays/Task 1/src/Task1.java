/*
 *   Задание: Дана матрица. Вывести на экран все нечетные столбцы,
 *   у которых первый элемент больше последнего.
 *
 *   Dzmitry Siarheyeu
 *   17.02.2021
 */

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int n, k, count = 0;
        int[][] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Output of odd columns of a matrix with 1 element greater than the last one");
        System.out.println("Input n and k:");

        n = input.nextInt();
        k = input.nextInt();

        array = new int[n][k];

        System.out.println("Matrix: ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++) {
                array[i][j] = random.nextInt(100);
                System.out.printf("%4d", array[i][j]);
            }
            System.out.print("\n");
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++) {
                if (j % 2 == 0 && array[0][j] > array[n-1][j]) {
                    if(count == 0){
                        System.out.println("Suitable columns:");
                    }
                    System.out.printf("%4d", array[i][j]);
                    count++;
                }
            }
            if(count > 0) {
                System.out.print("\n");
            }
        }

        if (count == 0) {
            System.out.println("No matching columns");
        }

        input.close();

    }
}
