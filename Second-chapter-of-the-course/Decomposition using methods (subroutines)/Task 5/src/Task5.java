import java.util.Random;
import java.util.Scanner;

public class Task5{

    public static void main(String[] args) {

        int n, preMax;
        int[] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Search for the second largest element in the array A(N)");

        System.out.println("Input n: ");

        n = input.nextInt();

        array = new int[n];

        System.out.println("Array:");

        for(int i = 0; i < n; i++){
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        preMax = findSecondLargestElement(array);

        System.out.print("\nThe second largest element in the array: " + preMax);

        input.close();

    }

    private static int findSecondLargestElement(int[] arr) {
        int preMax;

        arr = sortArray(arr);

        preMax = arr[arr.length-2];

        return preMax;
    }

    private static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i], min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        return arr;
    }
}
