/*
 *   Задание: Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 *
 *   Dzmitry Siarheyeu
 *   15.11.2020
 */

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        String in;
        int max = 0, temp = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Search for the largest number of consecutive spaces in the text");
        System.out.println("Input text:");

        in = input.nextLine();

        for(int i = 0; i < in.length(); i++){
            if(in.charAt(i) == ' ') {
                temp++;
                if(temp > max) max = temp;
            }else temp=0;
        }

        System.out.println("The largest number of consecutive spaces in the text is " + max);

        input.close();
    }
}
