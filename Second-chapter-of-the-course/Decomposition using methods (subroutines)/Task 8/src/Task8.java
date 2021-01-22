import java.util.Random;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        int D, k, m;
        int[] array, sum;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Calculating the sum of three consecutive array elements");
        System.out.println("Enter the length of the array:");

        D = input.nextInt();

        array = new int[D];

        System.out.print("Array: ");

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.println("\nEnter the array interval to calculate the amounts k and m: ");

        k = input.nextInt();
        m = input.nextInt();

        while (check(k,m, D)){
            if(k<1){
                System.out.println("The initial number cannot be less than 1");
            }else if(m>D){
                System.out.println("The final number cannot exceed the length of the array");
            }else if((m-k+1)%3 != 0){
                System.out.println("The difference between m and k must be a multiple of 3");
            }
            System.out.println("Input k and m");

            k = input.nextInt();
            m = input.nextInt();

        }

        sum = sumThreeConsecutiveNumbers(array, k, m);

        for (int i = 0; i < (m-k+1)/3; i++){
            System.out.printf("Sum of D[%d]+D[%d]+D[%d] = %d\n", k+(i*3), k+(i*3)+1, k+(i*3)+2, sum[i]);
        }

        input.close();

    }

    private static int[] sumThreeConsecutiveNumbers(int[] array, int k, int m) {
        int[] sum = new int[(m-k+1)/3];

        for(int i = 0; i < (m-k+1)/3; i++){
            for (int j = (k-1)+(3*i); j < (k+(3*i))+2; j++){
                sum[i] = sum[i] + array[j];
            }
        }

        return sum;
    }

    private static boolean check(int k, int m, int D) {
        if(k<1) return true;
        else if(m>D) return true;
        else if((m-k+1)%3 != 0) return true;

        return false;
    }

}
