/*
 *   Задание: Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 *
 *   Dzmitry Siarheyeu
 *   17.02.2021
 */

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int n;
        int[][] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Displaying diagonal elements on the screen");
        System.out.println("Input n:");

        n = input.nextInt();


        array = new int[n][n];

        System.out.println("Matrix: ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(100);
                System.out.printf("%4d", array[i][j]);
            }
            System.out.print("\n");
        }

        System.out.print("Elements that stand on the diagonal: ");

        for(int i = 0; i < n; i++){
            System.out.print(array[i][i] + " ");
        }

        System.out.print("\nElements standing on the side of the diagonal: ");

        for(int i = 0; i < n; i++){
            System.out.print(array[i][n-1-i] + " ");
        }

        input.close();

    }
}
