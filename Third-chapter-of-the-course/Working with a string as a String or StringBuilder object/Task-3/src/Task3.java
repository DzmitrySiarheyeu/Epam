/*
 *   Задание: Проверить, является ли заданное слово палиндромом.
 *
 *   Dzmitry Siarheyeu
 *   21.02.2021
 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        String in, lowcase;

        Scanner input = new Scanner(System.in);

        System.out.println("Checking a word for palindrome\n0 - exit");

        while (true) {
            System.out.println("Input word:");

            in = input.nextLine();
            lowcase = in.toLowerCase();

            if(in.equals("0")) break;

            if(lowcase.equals(new StringBuilder(lowcase).reverse().toString())) System.out.printf("The word \"%s\" is a palindrome\n", in);
            else System.out.printf("The word \"%s\" is not a palindrome\n", in);

        }

        input.close();
    }
}
