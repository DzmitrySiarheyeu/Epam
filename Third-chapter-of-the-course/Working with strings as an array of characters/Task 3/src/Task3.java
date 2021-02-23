/*
 *   Задание: В строке найти количество цифр.
 *
 *   Dzmitry Siarheyeu
 *   21.02.2021
 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        String in;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Search for the number of digits in a string");
        System.out.println("Input text:");

        in = input.nextLine();

        for (int i = 0; i < in.length(); i++) {
            if (Character.isDigit(in.charAt(i))) {
                count++;
            }
        }

        if(count==0) System.out.print("There are no numbers in the line");
        else System.out.printf("The line contains %d digits", count);

        input.close();
    }
}
