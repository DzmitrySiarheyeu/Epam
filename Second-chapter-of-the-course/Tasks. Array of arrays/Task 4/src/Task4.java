/*
 *   Задание:сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *   (1   2   3   ...   n)
 *   (n  n-1 n-2  ...   1)
 *   (1   2   3   ...   n)
 *   (n  n-1 n-2  ...   1)
 *   (... ... ... ... ...)
 *   (n  n-1 n-2  ...   1)
 *
 *   Dzmitry Siarheyeu
 *   18.02.2021
 */

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int n;
        int[][] array;

        Scanner input = new Scanner(System.in);

        System.out.println("Creating a square matrix based on a sample");
        System.out.println("Input n:");

        n = input.nextInt();

        while(chek(n)){
            System.out.print("n is odd number, enter n: ");
            n = input.nextInt();
        }

        array = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    array[i][j] = j+1;
                }else {
                    array[i][j] = n-j;
                }
            }
        }

        System.out.println("Matrix: ");
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.print("\n");
        }


        input.close();

    }

    public static boolean chek(int x) {
        if(x%2 != 0){
            return true;
        }else return false;
    }

}
