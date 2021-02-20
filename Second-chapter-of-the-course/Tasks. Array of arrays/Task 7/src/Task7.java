/*
 *   Задание: Сформировать квадратную матрицу порядка N по правилу:
 *   A[I, J] = sin ((I^2 - J^2) / N)
 *   и подсчитать количество положительных элементов в ней.
 *
 *   Dzmitry Siarheyeu
 *   18.02.2021
 */

import java.util.Scanner;
import static java.lang.Math.*;

public class Task7 {

    public static void main(String[] args) {

        int n, count =0;
        double[][] array;

        Scanner input = new Scanner(System.in);

        System.out.println("Creating a square matrix based on a sample");
        System.out.println("Input n:");

        n = input.nextInt();

        array = new double[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                array[i][j] = sin((pow(i+1, 2)-pow(j+1, 2))/n);
                if(array[i][j] > 0) count++;
                System.out.printf("%8.2f", array[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("The number of positive elements is equal to " + count);

        input.close();

    }
}
