import java.util.Random;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        int n, m, sum = 0, max = 0;
        int[][] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Search for the column with the maximum amount, count the sum of elements in each column");
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

        for(int i = 0; i < m; i++){
            System.out.printf("The sum of the elements in %d column is ", i+1);
            for(int j = 0; j < n; j++){
                sum += array[j][i];
                if(j == n-1){
                    System.out.println(sum);
                    if(sum>max){
                        max = sum;
                    }
                    sum = 0;
                }

            }
        }

        System.out.println("The maximum sum of column elements is " + max);

        input.close();

    }
}
