/*
 *   Задание: Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *   ( 1   1   1  ...  1   1   1 )
 *   ( 0   1   1  ...  1   1   0 )
 *   ( 0   0   1  ...  1   0   0 )
 *   (... ... ... ... ... ... ...)
 *   ( 0   1   1  ...  1   1   0 )
 *   ( 1   1   1  ...  1   1   1 )
 *
 *   Dzmitry Siarheyeu
 *   18.02.2021
 */

import java.util.Scanner;

public class Task6 {

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
                if (i < n / 2 && j < n / 2 && i>j) {
                    array[i][j] = 0;
                }else array[i][j] = 1;

            }
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[n-1-i][j] = array[i][j];
                array[i][n-1-j] = array[i][j];
                System.out.printf("%4d", array[i][j]);
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
