import java.util.Random;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        int n, count = 0;
        int[] positiv = new int[255];
        int[][] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Search for positive elements of the main diagonal");
        System.out.println("Input n:");

        n = input.nextInt();

        array = new int[n][n];

        System.out.println("Matrix: ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                array[i][j] = 50 - random.nextInt(100);
                System.out.printf("%4d", array[i][j]);
            }
            if(array[i][i]>0){
                positiv[count] = array[i][i];
                count++;
            }
            System.out.print("\n");
        }

        if(count == 0){
            System.out.println("There are no positive elements on the main diagonal");
        }else{
            System.out.print("Elements on the main diagonal: ");
            for(int i = 0; i<count; i++){
                System.out.print(positiv[i] + " ");
            }
        }



        input.close();

    }
}
