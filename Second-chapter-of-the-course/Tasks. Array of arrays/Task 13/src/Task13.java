import java.util.Random;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        int n, m, temp;
        int[][] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Sorting columns");
        System.out.println("Input n and m");

        n = input.nextInt();
        m = input.nextInt();

        array = new int[n][m];

        System.out.println("Matrix: ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(15);
                System.out.printf("%4d", array[i][j]);
            }
            System.out.print("\n");
        }

        for(int k = 0; k < m; k++)
        {
            for(int i = 0; i < n-1; i++)
            {
                for(int j = 0; j < n-i-1; j++)
                {
                    if(array[j][k]>array[j+1][k])
                    {
                        temp = array[j][k];
                        array[j][k] = array[j+1][k];
                        array[j+1][k] = temp;
                    }
                }
            }
        }

        System.out.println("Matrix with sorted columns in ascending order: ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("Matrix with sorted columns in descending order: ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                System.out.printf("%4d", array[n-1-i][j]);
            }
            System.out.print("\n");
        }

        input.close();

    }
}
