/*
 *   Задание: Матрица 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и
 *   номера строк, в которых число 5 встречается три и более раз.
 *
 *   Dzmitry Siarheyeu
 *   02.11.2020
 */

import java.util.Random;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        int n = 10, m = 20, last = 0, c = 0;
        int[][] array;
        int[] count;

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("");

        array = new int[n][Output of k row and p columnm];
        count = new int[n];

        System.out.println("Matrix: ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(15);
                System.out.printf("%4d", array[i][j]);
                if(last != i){
                    last++;
                }else {
                    if(array[i][j] == 5){
                        count[i]++;
                    }
                }
            }
            System.out.print("\n");
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] > 3){
                System.out.printf("In line %d, the number 5 occurs %d times \n", i+1, count[i]);
                c++;
            }else if(count[i] == 3){
                System.out.printf("In line %d, the number 5 occurs 3 times \n", i+1);
                c++;
            }
        }

        if(c == 0){
            System.out.println("The number 5 does not occur 3 or more times in any line");
        }
        input.close();

    }
}
