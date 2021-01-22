import java.util.Random;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        int n, sum=0;
        int[] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Finding max(a1 + a2n, a2 + a2n-1, ... , an + an+1)");
        System.out.println("Input n:");

        n = input.nextInt();

        array = new int[n];

        System.out.print("Array: ");

        for(int i = 0 ; i < n ; i++){
            array[i] = random.nextInt(1000);
            System.out.print(array[i] + " ");

        }

        System.out.print("\nThe maximum is: " + getMaxSum(array));

        input.close();

    }

    public static int getMaxSum(int[] array) {
        int maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }
        }
        return maxSum;
    }
}
