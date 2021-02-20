/*
 *   Задание: Сортировка вставками. Дана последовательность чисел a1, a2, ..., an.
 *   Требуется переставить числа в порядке возрастания. Делается это следующим образом.
 *   Пусть a1, a2, ..., ai - упорядоченная последовательность, т.е. a1 <= a2 <= ... <= an.
 *   Берется следующее число ai+1 и вставляется в последовательость так, чтобы новая
 *   последовательность была тоже возрастающей. Процесс производится до тех пор пока все
 *   элементы от i+1 до n не будут перебраны. примечание. Место помещения очередного элемента
 *   в отсортированную часть производится с помощью двоичного поиска. Двоичный поиск оформить
 *   в виде отдельной функции.
 *
 *   Dzmitry Siarheyeu
 *   20.02.2021
 */

import java.util.Random;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        int n;
        int[] array;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("The insertion sort");
        System.out.println("Input n:");

        n = input.nextInt();


        array = new int[n];

        System.out.print("Array: ");

        for(int i = 0 ; i < n ; i++){
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.print("\nNew array: ");

        array = sort2(array);

        for(int i = 0 ; i < n ; i++){
            System.out.print(array[i] + " ");
        }

        input.close();

    }

    public static int[] sort2(int[] arr){
        for (int i = 1; i < arr.length; i++) {

            int x = arr[i];

            int j = Math.abs(binarySearch(arr, 0, i, x) + 1);

            System.arraycopy(arr, j, arr, j+1, i-j);

            arr[j] = x;

        }
        return arr;
    }

    public static int binarySearch(int[] arr, int fromIndex, int toIndex, int key){

        int low = fromIndex, high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = arr[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }
}
