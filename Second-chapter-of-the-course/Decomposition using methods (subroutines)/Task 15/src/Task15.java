import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Task15 {

    public static void main(String[] args) {

        int n;
        ArrayList<Integer> array;

        array = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);

        System.out.println("Search for all n-digit numbers forming an increasing sequence\nInput n:");

        n = input.nextInt();

        while (chek(n)){
            if(n>9) System.out.println("There are no numbers with this value");
            else System.out.println("The number must be greater than 1");
            System.out.println("Input k: ");
        }

        array = searchIncreasingDigits(n);

        System.out.printf("Out of %d combinations of numbers with increasing digits: ", (int)pow(10, n));
        System.out.print(array);

        input.close();

    }

    private static ArrayList<Integer> searchIncreasingDigits(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int[] variables = getVariables(n);

        arr = getNum(variables, n);

        return arr;
    }

    private static ArrayList<Integer> getNum(int[] variables, int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = variables[0]; i <= variables[1]; i++)
        {
            int k = i, d = k % 10, j;

            for (j = 1; j < n; j++)
            {
                k /= 10;
                if (k % 10 >= d) break;
                d = k % 10;
            }
            if (j == n) arr.add(i);
        }

        return arr;
    }

    private static int[] getVariables(int n) {
        int []arr = new int[3];
        arr[2] = 1;

        for (int i = 0; i < n; i++)
        {
            arr[0] += (n - i) * arr[2];
            arr[1] += (9 - i) * arr[2];
            arr[2] *= 10;
        }

        return arr;
    }


    private static boolean chek(int n) {
        if(n < 2) return true;
        else if (n>9) return true;
        else return false;
    }
}
