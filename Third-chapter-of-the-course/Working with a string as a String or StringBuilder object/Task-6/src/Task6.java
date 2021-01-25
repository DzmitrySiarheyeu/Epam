/*
 *   Задание: Из заданной строки получить новую, повторив каждый символ дважды.
 *
 *   Dzmitry Siarheyeu
 *   17.11.2020
 */

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        String in;
        int temp = 0, length;

        Scanner input = new Scanner(System.in);

        System.out.println("The repetition of characters in the text twice");
        System.out.println("Input text:");

        in = input.nextLine();

        length = in.length()*2;

        while (temp < length){
            in = new StringBuilder(in).insert(temp+1, in.charAt(temp)).toString();
            temp+=2;
        }

        System.out.println("Result: " + in);

        input.close();
    }
}
