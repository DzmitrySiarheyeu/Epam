import java.util.Random;
import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        int n, m, max = 0;
        int[][] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Finding the maximum element of the matrix and replacing all odd numbers with it");
        System.out.println("Input n and m:");

        n = input.nextInt();
        m = input.nextInt();

        array = new int[n][m];

        System.out.println("Matrix: ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(100);
                System.out.printf("%4d", array[i][j]);
                if(max < array[i][j]){
                    max = array[i][j];
                }
            }
            System.out.print("\n");
        }

        System.out.println("New matrix:");

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(array[i][j] % 2 != 0){
                    array[i][j] = max;
                }
                System.out.printf("%4d", array[i][j]);
            }
            System.out.print("\n");
        }

        input.close();

    }
}
