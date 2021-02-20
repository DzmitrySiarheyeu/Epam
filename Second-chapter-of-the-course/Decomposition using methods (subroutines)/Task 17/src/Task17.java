/*
 *   Задание: Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
 *   Сколько таких действий надо произвести, чтобы получить нуль? Для решения задачи использовать
 *   декомпозицию.
 *
 *   Dzmitry Siarheyeu
 *   20.02.2021
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {

        int n, count;

        Scanner input = new Scanner(System.in);

        System.out.println("Counting actions for subtracting the sum of digits of a number\nInput n:");

        n = input.nextInt();

        while (n<0){
            System.out.println("The number cannot be negative \nInput n: ");
            n = input.nextInt();
        }

        count = searchNumSubtr(n);

        System.out.print("The number of actions for subtracting the sum of digits of a number is equal to " + count);

        input.close();

    }

    private static int searchNumSubtr(int n) {
        int sumDigits, count =0;

        while (n>0){
            sumDigits = getSumDigits(n);
            n = n - sumDigits;
            count++;
        }
        return count;
    }



    private static int getSumDigits(int n) {
       ArrayList<Integer> arr = getDigits(n);
       int sum = 0;
       for(int i = 0; i<arr.size(); i++){
           sum += arr.get(i);
       }
       return sum;
    }

    private static ArrayList<Integer> getDigits(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        while (n>0){
            arr.add(n%10);
            n = n/10;
        }
        return arr;
    }
}
