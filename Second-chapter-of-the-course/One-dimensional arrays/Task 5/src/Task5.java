import java.util.Random;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        int n, min = -500;
        int[] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("The definition of numbers is larger than a[i] > i");
        System.out.println("Input i");

        n = input.nextInt();

        array = new int[n];

        System.out.print("Array: ");

        for(int i = 0; i < n; i++){
            array[i] = min + random.nextInt(1000);
            System.out.print(array[i] + " ");
        }

        System.out.print("\nNumbers a[i] > i: ");

        for(int i = 0 ; i < n ; i++){
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }



        input.close();

    }
}
