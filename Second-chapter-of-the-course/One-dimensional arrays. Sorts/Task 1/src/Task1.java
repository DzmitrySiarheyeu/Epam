/*
 *   Задание: Заданы два одномерных массива с различным количество элементов и натуральное число k.
 *   Объудинить их в один массив, второй массив между k-м и (k+1) - м элементами первого, при этом
 *   не используя дополнительный массив.
 *
 *   Dzmitry Siarheyeu
 *   03.11.2020
 */

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int n1, n2, k;
        int[] arrayA, arrayB;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Combining arrays into one with inserting a second array between k and k+1");
        System.out.println("Input n1 and n2:");

        n1 = input.nextInt();
        n2 = input.nextInt();

        arrayA = new int[n1+n1+n2];
        arrayB = new int[n2];

        System.out.print("Array A: ");

        for(int i = n1 ; i < n1+n1 ; i++){
            arrayA[i] = rand.nextInt(100);
            System.out.print(arrayA[i] + " ");
        }

        System.out.print("\nArray B: ");

        for(int i = 0 ; i < n2 ; i++){
            arrayB[i] = rand.nextInt(100);
            System.out.print(arrayB[i] + " ");
        }

        System.out.println("\nInput k:");

        k = input.nextInt();

        for(int i = 0 ; i < n1+n2 ; i++){
            if(i<k){
                arrayA[i]=arrayA[n1+i];
            }else if(i>=k && i<k+n2){
                arrayA[i]=arrayB[i-k];
            }else arrayA[i]=arrayA[n1+i-n2];
        }

        System.out.print("New array: ");

        for(int i = 0 ; i < n1+n2 ; i++){

            System.out.print(arrayA[i] + " ");
        }


        input.close();

    }
}
