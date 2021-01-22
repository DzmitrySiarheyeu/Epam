import java.util.Random;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        int n, valResult, popResult;
        int[] array, popl;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("The definition of numbers is larger than a[i] > i");
        System.out.println("Input n:");

        n = input.nextInt();

        array = new int[n];
        popl = new int[n];

        System.out.print("Array: ");

        for(int i = 0; i < n; i++){
            array[i] = random.nextInt(5);
            System.out.print(array[i] + " ");
        }

        popl = new int[array.length];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i] == array[j]) {
                    popl[i]++;
                }
            }
        }

        valResult = array[0];
        popResult = popl[0];
        for (int i = 0; i < n; i++) {
            if (popl[i] > popResult) {
                popResult = popl[i];
                valResult = array[i];
            }
            if ((popResult == popl[i]) && (array[i] < valResult)) {
                valResult = array[i];
            }
        }

        System.out.print("\nThe smallest number most often repeated is " + valResult);

        input.close();

    }
}
