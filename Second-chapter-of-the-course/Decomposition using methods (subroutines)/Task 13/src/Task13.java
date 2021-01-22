/*
 *   Задание: Два простых числа называются "близницами", если они отличаются друг от друга на 2
 *   (например, 41 и 43). Найти и напечатать все пары "близницов" из отпрезка [n, 2n], где n - заданное
 *   натуральное число больше 2. Для решения задачи использовать декомпозицию.
 *
 *   Dzmitry Siarheyeu
 *   11.11.2020
 */

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        int n;
        int[][] array;

        Scanner input = new Scanner(System.in);

        System.out.println("Search for \"Gemini\" numbers\nInput n:");

        n = input.nextInt();

        while (chek(n)){
            System.out.println("The number must be greater than 2\nInput n: ");
        }

        array = getGemini(n);

        printArray(array);

        input.close();

    }

    private static void printArray(int[][] array) {
        System.out.print("The \"Gemini\" numbers: ");
        for (int i = 0; i < array[0].length; i++){
            System.out.printf("(%d, %d) ", array[0][i], array[1][i]);
        }
    }

    private static int[][] getGemini(int n) {
        int[][] arr = new int[2][2*n-n-1];

            for(int i = 0; i < 2*n-n; i++){
                if(n+2+i <= 2*n){
                    arr[0][i] = n+i;
                    arr[1][i] = n+2+i;
                }
            }

        return arr;
    }

    private static boolean chek(int n) {
        if(n < 2) return true;
        else return false;
    }
}
