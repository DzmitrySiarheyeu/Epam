/*
 *   Задание: Написать программу, определяющую сумму n-значных чисел, содержащих только нечетные цифры.
 *   Определить также, сколько четных цифр в найденой сумме. Для решения задачи использовать декомпозицию.
 *
 *   Dzmitry Siarheyeu
 *   20.02.2021
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {

        int n;

        BigInteger sum;

        Scanner input = new Scanner(System.in);

        System.out.println("Counting the sum of all odd numbers of an n-digit number\nInput n:");

        n = input.nextInt();

        while (chek(n)){
            System.out.println("The number must be between 1 and 9 \nInput n: ");
            n = input.nextInt();
        }

        sum = calcSum(n);

        System.out.print("Sum of all odd numbers of an n-digit number: " + sum);

        input.close();

    }

    private static BigInteger calcSum(int n) {
        BigInteger sum;
        ArrayList<Integer> arr = getOddNum(n);
        System.out.println("All odd numbers of an n-digit number: " + arr);

        sum = getSum(arr);

        return sum;
    }

    private static BigInteger getSum(ArrayList<Integer> arr) {
        BigInteger sum = new BigInteger("0");
        for(int i = 0; i<arr.size(); i++) sum = sum.add(BigInteger.valueOf(arr.get(i)));
        return sum;
    }

    private static ArrayList<Integer> getOddNum(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] variables = getVariables(n);


        for(int i = variables[0]; i <= variables[1]; i++ ){
            int j, k = i;
            for(j = 1; j <=n; j++){
                if(k % 2 == 0) break;
                k = k / 10;
            }
            if(j == n+1) arr.add(i);
        }
        return arr;
    }

    private static int[] getVariables(int n) {
       int[] arr = new int[2];
        int k = 1;
        for(int i = 1; i <= n; i++){
            arr[0] += k;
            arr[1] += k * 9;
            k *= 10;
        }
        return arr;
    }

    private static boolean chek(int n) {
        if(n < 2) return true;
        else if(n>9) return true;
        else return false;
    }
}
