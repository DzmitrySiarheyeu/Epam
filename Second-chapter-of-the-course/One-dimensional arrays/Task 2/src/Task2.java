/*
 *   Задание: Дана последовательность действительных чисел a1, a2, ..., an. Заменить все ее члены,
 *   больше заданного Z, этим числом. Подсчитать количество замен.
 *
 *   Dzmitry Siarheyeu
 *   17.02.2021
 */

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int n, Z, sum = 0;
        int[] array;

        Scanner input = new Scanner(System.in);


        System.out.println("Replacing consecutive real numbers greater than Z with this number");
        System.out.println("Input n and Z:");

        n = input.nextInt();
        Z = input.nextInt();
        array = new int[n];

        System.out.print("Array: ");

        for(int i = 0 ; i < n ; i++){
            array[i] = i+1;
            System.out.print(array[i] + " ");
            if (array[i] > Z) {
                array[i] = Z;
                sum++;
            }
        }

        System.out.println("\nNumber of substitutions: " + sum + "\nNew array: ");

        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }

        input.close();

    }

}
