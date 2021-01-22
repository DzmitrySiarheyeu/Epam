import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int N, max=0, min=0, maxi, mini, m = -50;
        int[] array;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Replacing the smallest and largest element in the array");
        System.out.println("Input N:");

        N = input.nextInt();

        array = new int[N];

        System.out.print("This array: ");

        for (int i = 0; i < N; i++) {
            array[i] = m + random.nextInt(100);
            System.out.print(array[i] + " ");
            if(array[i] > array[max]){
                max = i;
            }else if(array[i] < array[min]){
                min = i;
            }
        }
        maxi = array[max];
        mini = array[min];
        array[max] = array[min];
        array[min] = maxi;

        System.out.printf("\nLargest element = %d located on the N = %d \nSmallest element = %d located on N = %d", maxi, max+1, mini, min+1);

        System.out.print("\nNew array: ");
        for(int i = 0; i < N; i++){
            System.out.print(array[i] + " ");
        }

        input.close();

    }
}
