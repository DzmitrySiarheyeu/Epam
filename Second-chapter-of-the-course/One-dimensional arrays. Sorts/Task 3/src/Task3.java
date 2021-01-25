/*
 *   Задание: Сортировка выбором. Дана последоввтельность чисел a1 <= a2 <= ... <= an. Требуется
 *   переставить элементы так, чтобы они были расположены по убываию. Для этого в массиве, начиная
 *   с первого, выбирается наибольший элемент и становится на первое место, а первый - на место
 *   наибольшего. затем, начиная со второго, эта процедура повторяется. НАписать алгоритм сортировки выбором.
 *
 *   Dzmitry Siarheyeu
 *   03.11.2020
 */

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int n;
        int[] array;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Sorting by choice");
        System.out.println("Input n:");

        n = input.nextInt();

        array = new int[n];

        System.out.print("Array: ");

        for(int i = 0; i < n; i++){
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }

        array = sort(array,"increase");

        System.out.print("\nSorting the array in increase order: ");

        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }

        array = sort(array, "decrease");

        System.out.print("\nSorting the array in descending order: ");

        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }

        input.close();

    }

    public static int[] sort(int[] arr, String direction){
        if(direction.equals("decrease")){
            for (int i = 0; i < arr.length; i++) {
                int max = arr[i], max_i = i;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                        max_i = j;
                    }
                }
                if (i != max_i) {
                    int tmp = arr[i];
                    arr[i] = arr[max_i];
                    arr[max_i] = tmp;
                }
            }
        }else{
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
        }
        return arr;
    }
}
