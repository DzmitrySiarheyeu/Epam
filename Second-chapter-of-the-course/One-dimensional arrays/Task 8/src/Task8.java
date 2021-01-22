import java.util.Random;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        int n, minCount = 0, min, count = 0;
        int[] array, result;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Forming a new sequence by throwing out the minimum terms");
        System.out.println("Input i:");

        n = input.nextInt();

        array = new int[n];
        min = array[0];

        System.out.print("Array: ");

        for(int i = 0; i < n; i++){
            array[i] = random.nextInt(1000);
            System.out.print(array[i] + " ");
        }
        min = array[0];
    for(int i = 0; i < n; i++) {
        if (array[i] < min) {
            min = array[i];
        }
    }
        for (int value : array) {
            if (value == min) {
                minCount++;
            }
        }

        result = new int[array.length - minCount];

        for(int i = 0; i<array.length; i++){
            if(array[i] != min){
                result[count] = array[i];
                count++;
            }
        }

        System.out.print("\nNew array: ");

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

        input.close();

    }
}
