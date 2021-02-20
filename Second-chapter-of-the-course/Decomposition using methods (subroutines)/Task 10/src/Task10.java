/*
 *   Задание: Дано натуральное число N. Написать метод(методы) для формирования массива,
 *   элементами которого являются цифры числа N.
 *
 *   Dzmitry Siarheyeu
 *   20.02.2021
 */

import java.util.Scanner;
import static java.lang.Math.*;

public class Task10 {

    public static void main(String[] args) {

        int N;
        int[] array;

        Scanner input = new Scanner(System.in);

        System.out.println("Forming an array whose elements are digits of the number N");
        System.out.println("Input N: ");

        N = input.nextInt();

        array = createArray(N);

        System.out.print("Array: ");

        for (int i : array) {
            System.out.print(i + " ");
        }

        input.close();
    }

    private static int[] createArray(int n) {
        int len;
        int[] array;

        len = (int)log10(n) + 1;

        array = new int[len];

        for(int i = len-1; i>=0; --i){
            array[i] = n%10;
            n = n/10;
        }

        return array;
    }
}
