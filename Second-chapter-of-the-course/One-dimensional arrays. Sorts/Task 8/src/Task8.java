/*
 *   Задание: Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральные). Составить программу,
 *   которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 *
 *   Dzmitry Siarheyeu
 *   04.11.2020
 */

import java.util.Random;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        int n;
        int[][] array;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Finding the common divisor and sorting fractions in ascending order");

        System.out.println("Input n: ");

        n = input.nextInt();

        array = new int[2][n];

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < n; j++){
                array[i][j] = 1 + rand.nextInt(10);
            }
        }

        System.out.println("List of fractions: ");

        for (int i = 0; i < n; i++){
            System.out.print(array[0][i] + "/" + array[1][i] + " ");
        }

        System.out.println("\nFractions with a common denominator: ");

        while (array[1][0] != array[1][n-2]){
            for (int i = 0; i < n - 1; i++) {
                int j = lcm(array[1][i], array[1][i + 1]);

                array[0][i] = array[0][i] * (j / array[1][i]);
                array[0][i+1] = array[0][i+1] * (j / array[1][i+1]);
                array[1][i] = j;
                array[1][i+1] = j;
            }
        }

        for (int i = 0; i<n; i++) {
            System.out.print(array[0][i] + "/" + array[1][i] + " ");
        }

        System.out.println("\nFractions in ascending order:");

        sort(array[0]);

        for (int i = 0; i<n; i++) {
            System.out.print(array[0][i] + "/" + array[1][i] + " ");
        }

        input.close();

    }

    private static int[] sort(int[] arr) {
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

    public static int lcm(int a,int b){
        return (a * b) / gcd(a,b);
    }

    public static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }
}
