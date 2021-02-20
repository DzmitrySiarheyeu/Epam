/*
 *   Задание: Дан массив действительных чисел, размерность которого N. Подсчитать,
 *   сколько в нем отрицательных, положительных и нулувых элементов.
 *
 *   Dzmitry Siarheyeu
 *   17.02.2021
 */

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int N, sumPos = 0, sumNeg = 0, sumNull = 0, min = -500;
        int[] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Finding the number of negative, positive, and null elements");
        System.out.println("Input N:");

        N = input.nextInt();

        array = new int[N];

        System.out.print("Array: ");

        for (int i = 0; i < N; i++) {
            array[i] = min + random.nextInt(1000);
            System.out.print(array[i] + " ");
            if (array[i] > 0) {
                sumPos++;
            }else if(array[i] < 0) {
                sumNeg++;
            }else sumNull++;
        }

        System.out.printf("\nNumber of positive = %d, of negativ = %d, of null = %d",sumPos, sumNeg, sumNull);


        input.close();

    }
}
