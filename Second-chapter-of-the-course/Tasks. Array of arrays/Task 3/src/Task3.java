import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int n, m, k, p, count = 0;
        int[][] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Output of k row and p column");
        System.out.println("Input n and m:");

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

        System.out.println("Input number of row: ");

        k = input.nextInt();

        for(int i = 0; i < m; i++){
            System.out.print(array[k-1][i] + " ");
        }

        System.out.println("\nInput number of column: ");

        p = input.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println(array[i][p-1]);
        }

        input.close();

    }
}
