/*
 *   Задание: Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
 *   Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 *   Дополнительный массив не использовать.
 *
 *   Dzmitry Siarheyeu
 *   03.11.2020
 */

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int n1, n2, k;
        int[] arrayA, arrayB;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Formation of a new ascending sequence");
        System.out.println("Input n1 and n2:");

        n1 = input.nextInt();
        n2 = input.nextInt();

        arrayA = new int[n1+n2];
        arrayB = new int[n2];

        System.out.print("Array A: ");

        for(int i = 0 ; i < n1 ; i++){
            arrayA[i] = rand.nextInt(100);
        }

       arrayA = sort(arrayA,n1);

        for(int i = 0 ; i < n1 ; i++){
            System.out.print(arrayA[i] + " ");
        }


        System.out.print("\nArray B: ");

        for(int i = 0 ; i < n2 ; i++){
            arrayB[i] = rand.nextInt(100);
        }

        arrayB = sort(arrayB, n2);

        for(int i = 0 ; i < n2 ; i++){
            System.out.print(arrayB[i] + " ");
        }

        System.arraycopy(arrayB,0,arrayA,n1,n2);
        arrayA = sort(arrayA, arrayA.length);

        System.out.print("\nNew array: ");

        for(int i = 0; i<arrayA.length; i++){
            System.out.print(arrayA[i] + " ");
        }

        input.close();

    }

    public static int[] sort(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            int min = arr[i], min_i = i;
            for (int j = i+1; j < n; j++) {
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
