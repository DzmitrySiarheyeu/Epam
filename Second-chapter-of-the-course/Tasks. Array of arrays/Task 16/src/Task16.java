/*
 *   Задание: Магическим квадратом порядка n называется квадратная матрица размера n x n,
 *   составленная из числа 1, 2, 3, ..., n^2 так, что суммы по каждому столбцу, каждой строке
 *   и каждой из двух больших диагоналей равны между собой. Построить такой квадрат. Пример
 *   магического квадрата порядка 3:
 *                        6 1 8
 *                        7 5 3
 *                        2 9 4
 *
 *   Dzmitry Siarheyeu
 *   03.11.2020
 */

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task16{

    public static void main(String[] args) {

        int n;


        Scanner input = new Scanner(System.in);

        System.out.println("Creating a magic square");
        System.out.println("Input n:");

        n = input.nextInt();

        while (n<3){
            System.out.println("Uncorrected n, input n:");
            n = input.nextInt();
        }

        System.out.println("Magic square:");

        if(n%2 != 0){

            printMatrix(oddMagicSquare(n));
        }else if(n%4 == 0){
            printMatrix(multipleFourMagicSquare(n));
        }else{
            printMatrix(evenSquare(n));
        }


    }

    private static int[][] evenSquare(int n) {
        int[][] magicSquare = new int[n][n], temp;
        int oddSquare = n/2;

        temp = oddMagicSquare(oddSquare);

        for(int i = 0; i < temp.length; i++){
            for (int j = 0; j < temp.length; j++){
                magicSquare[i][j] = temp[i][j];
            }
        }

        for(int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                if(j>=magicSquare.length/2 && i <magicSquare.length/2){
                    magicSquare[i][j] = magicSquare[i][j-magicSquare.length/2]+ ((int)pow(oddSquare,2) * 2);
                }else if(j<magicSquare.length/2 && i >=magicSquare.length/2){
                    magicSquare[i][j] = magicSquare[i-magicSquare.length/2][j]+((int)pow(oddSquare,2) * 3);
                }else if(j>=magicSquare.length/2 && i >=magicSquare.length/2){
                    magicSquare[i][j] = magicSquare[i-magicSquare.length/2][j-magicSquare.length/2]+(int)pow(oddSquare,2);
                }
            }
        }

        magicSquare[0][0] = magicSquare[0][0] + ((int)pow(oddSquare,2) * 3);
        magicSquare[magicSquare.length/2-1][0] = magicSquare[magicSquare.length/2-1][0] + ((int)pow(oddSquare,2) * 3);
        magicSquare[magicSquare.length/2][0] = magicSquare[magicSquare.length/2][0] - ((int)pow(oddSquare,2) * 3);
        magicSquare[magicSquare.length-1][0] = magicSquare[magicSquare.length-1][0] - ((int)pow(oddSquare,2) * 3);


            for(int i = 1; i < magicSquare.length/2-1; i++){
                magicSquare[i][1] = magicSquare[i][1] + ((int)pow(oddSquare,2) * 3);
            }

        for(int i = magicSquare.length/2+1; i < magicSquare.length-1; i++){
            magicSquare[i][1] = magicSquare[i][1] - ((int)pow(oddSquare,2) * 3);
        }

        if(oddSquare>=5){
            for(int i = 0; i < magicSquare.length; i++) {
                for (int j = magicSquare.length / 2 - ((oddSquare - 3) / 2); j <=magicSquare.length / 2 - 1 + ((oddSquare - 3) / 2); j++) {
                    if(j>=magicSquare.length/2 && i <magicSquare.length/2){
                        magicSquare[i][j] = magicSquare[i][j]-(int)pow(oddSquare,2);
                    }else if(j<magicSquare.length/2 && i >=magicSquare.length/2){
                        magicSquare[i][j] = magicSquare[i][j] - ((int)pow(oddSquare,2)*3);
                    }else if(j>=magicSquare.length/2 && i >=magicSquare.length/2){
                        magicSquare[i][j] = magicSquare[i][j] + (int)pow(oddSquare,2);
                    }else magicSquare[i][j] = magicSquare[i][j] + ((int)pow(oddSquare,2)*3);
                }
            }
        }

        return magicSquare;
    }

    public static int[][] oddMagicSquare(int n) {
        int[][] magicSquare = new int[n][n];

        int number = 1;
        int row = 0;
        int column = n / 2;
        int curr_row;
        int curr_col;
        while (number <= n*n) {
            magicSquare[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = curr_row + 1;
                column = curr_col;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }
        return magicSquare;

    }

    public static int[][] multipleFourMagicSquare(int n){

            int[][] magicSquare = new int[n][n];

            int i, j;

            for ( i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    magicSquare[i][j] = (n * i) + j + 1;
                }
            }

            for ( i = 0; i < n/4; i++) {
                for (j = 0; j < n / 4; j++) {
                    magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
                }
            }

            for ( i = 0; i < n/4; i++) {
                for (j = 3 * (n / 4); j < n; j++) {
                    magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
                }
            }

            for ( i = 3 * n/4; i < n; i++) {
                for (j = 0; j < n / 4; j++) {
                    magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
                }
            }

            for ( i = 3 * n/4; i < n; i++) {
                for (j = 3 * n / 4; j < n; j++) {
                    magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
                }
            }

            for ( i = n/4; i < 3 * n/4; i++) {
                for (j = n / 4; j < 3 * n / 4; j++) {
                    magicSquare[i][j] = (n * n + 1) - magicSquare[i][j];
                }
            }
           return magicSquare;

    }

    public static void printMatrix (int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
    }
}