/*
 *   Задание: В числовой матрице поменять местами два столбца любых столбца, т.е. все
 *   элементы одного столбца поставить на соответствующие им позиции другого, а его
 *   элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 *
 *   Dzmitry Siarheyeu
 *   02.11.2020
 */

import java.util.Random;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        int n, m, col1, col2, temp;
        int[][] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Output of odd columns of a matrix with 1 element greater than the last one");
        System.out.println("Input n and k:");

        n = input.nextInt();
        m = input.nextInt();

        array = new int[n][m];

        System.out.println("Matrix: ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(100);
                System.out.printf("%4d", array[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("Enter the column numbers separated by a space: ");

        col1 = input.nextInt();
        col2 = input.nextInt();

        col1--;
        col2--;

        for(int i = 0; i < n; i++) {
                temp = array[i][col1];
                array[i][col1] = array[i][col2];
                array[i][col2] = temp;
        }

        System.out.println("New matrix: ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.print("\n");
        }

        input.close();

    }
}
