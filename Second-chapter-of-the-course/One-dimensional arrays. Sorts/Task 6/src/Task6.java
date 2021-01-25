/*
 *   Задание: Сортировка Шелла. Дан массив n дейсвительных чисел. требуется упорядочить его по возрастанию.
 *   Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, то
 *   продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один
 *   элемент назад. Составить алгоритм этой сортировки.
 *
 *   Dzmitry Siarheyeu
 *   04.11.2020
 */

import java.util.Random;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        int n;
        int[] array;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Shell sort");
        System.out.println("Input n:");

        n = input.nextInt();


        array = new int[n];

        System.out.print("Array: ");

        for(int i = 0 ; i < n ; i++){
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.print("\nNew array: ");

        array = sortShell(array);

        for(int i = 0 ; i < n ; i++){
            System.out.print(array[i] + " ");
        }

        input.close();

    }

    public static int[] sortShell(int[] arr){
        int step = arr.length / 2;
        while (step > 0)
        {
            int i, j;
            for (i = step; i < arr.length; i++)
            {
                int value = arr[i];
                for (j = i - step; (j >= 0) && (arr[j] > value); j -= step)
                    arr[j + step] = arr[j];
                arr[j + step] = value;
            }
            step /= 2;
        }
        return arr;
    }
}
