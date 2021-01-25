/*
 *   Задание: Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an.
 *   Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1.
 *   Усли ai > ai+1, то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены
 *   в порядке возрастания. Составить алгоритм сортировки, подсчитывая при этом количество перестановок.
 *
 *   Dzmitry Siarheyeu
 *   03.11.2020
 */

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static int count = 0;

    public static void main(String[] args) {

        int n;
        int[] array;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Sorting data");
        System.out.println("Input n:");

        n = input.nextInt();

        array = new int[n];


        System.out.print("Array: ");

        for(int i = 0 ; i < n ; i++){
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.print("\nSorting array: ");

        array = sort2(array);

        for(int i = 0 ; i < n ; i++){
            System.out.print(array[i] + " ");
        }

        System.out.print("\nNumber of permutations: " + count);

        input.close();

    }

    public static int[] sort2(int[] arr){
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }

        return arr;
    }
}
