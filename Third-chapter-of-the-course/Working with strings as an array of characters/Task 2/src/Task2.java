/*
 *   Задание: Зaмените в строке вс вхождения 'word' на 'letter'.
 *
 *   Dzmitry Siarheyeu
 *   15.11.2020
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        String in, word, letter;

        Scanner input = new Scanner(System.in);

        System.out.println("Replacing occurrences in a string");
        System.out.println("Input text:");

        in = input.nextLine();

        System.out.println("Input the word to replace and the word to replace with:");

        word = input.next();
        letter = input.next();

        System.out.print("Replaced text:\n" + in.replaceAll(word+" ", letter+" "));

        input.close();
    }
}
