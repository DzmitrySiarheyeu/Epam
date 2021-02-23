/*
 *   Задание: Подсчитать, сколько раз среди символов заданной строки встречается буква "a".
 *
 *   Dzmitry Siarheyeu
 *   21.02.2021
 */

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        String in;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Counting the number of repetitions of the letter \"a\" in the text");
        System.out.println("Input text:");

        in = input.nextLine();

        for(int i = 0; i < in.length(); i++){
            if(in.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.printf("The letter a occurs %d times in the text", count);

        input.close();
    }
}
