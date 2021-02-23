/*
 *   Задание: в строке найти количество чисел.
 *
 *   Dzmitry Siarheyeu
 *   21.02.2021
 */

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        String in;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Finding the number of numbers");
        System.out.println("Input text:");

        in = input.nextLine();

        for (int i = 1; i < in.length(); i++) {
            if (Character.isDigit(in.charAt(i)) && !Character.isDigit(in.charAt(i-1))) {
                count++;
            }
        }
        if(Character.isDigit(in.charAt(0)) && !Character.isDigit(in.charAt(1))){
            count++;
        }

        if(count==0) System.out.print("There are no numbers in the line");
        else System.out.printf("The text contains %d numbers", count);

        input.close();
    }
}
