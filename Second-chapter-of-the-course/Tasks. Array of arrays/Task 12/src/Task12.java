import java.util.Random;
import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        int n, m, temp;
        int[][] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Sorting rows");
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

        for(int k=0;k<n;k++)
        {
            for(int i=0;i<(m-1);i++)
            {
                for(int j=0;j<m-i-1;j++)
                {
                    if(array[k][j]>array[k][j+1])
                    {
                        temp = array[k][j];
                        array[k][j] = array[k][j+1];
                        array[k][j+1] = temp;
                    }
                }
            }
        }

        System.out.println("Matrix with sorted rows in ascending order: ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println("Matrix with sorted rows in descending order: ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                System.out.printf("%4d", array[i][m-1-j]);
            }
            System.out.print("\n");
        }

        input.close();

    }
}
