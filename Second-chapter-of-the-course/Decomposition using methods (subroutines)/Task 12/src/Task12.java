import java.util.Random;
import java.util.Scanner;

public class Task12 {

    private static int count=0;

    public static void main(String[] args) {

        int K, N;
        int[] array;

        Scanner input = new Scanner(System.in);

        System.out.println("Forming an array");
        System.out.println("Input K and N: ");

        K = input.nextInt();
        N = input.nextInt();

        while (chek(K, N)){
            if(N < 0 || K < 0){
                System.out.println("Numbers can't be negative");
            }

            System.out.println("Input K and N: ");

            K = input.nextInt();
            N = input.nextInt();
        }

        array = formingArray(K, N);

        System.out.print("Array: ");

        for(int i = 0; i < count; i++){
            System.out.print(array[i] + " ");
        }

        input.close();

    }

    private static boolean chek(int k, int n) {
        if(k < 0 || n < 0) return true;
        else return false;
    }

    private static int[] formingArray(int k, int n) {
        int rand;
        int[] arr = new int[255];

        Random random = new Random();

        for(int i = 0; i < arr.length; i++) {
            rand = 1+random.nextInt(n);
            while (sumArray(arr)+rand > k){
                rand = random.nextInt(n);
            }

            if (sumArray(arr) == k) {
                return arr;
            }else if(sumArray(arr) < k){
                arr[i] = rand;
                count++;
            }
        }

        return arr;
    }

    private static int sumArray(int[] arr) {
        int sum=0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
