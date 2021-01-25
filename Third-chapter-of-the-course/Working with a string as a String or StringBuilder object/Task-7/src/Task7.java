/*
 *   Задание: Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 *   Например, если было введено "abc cde def", то должно вывести "abcdef".
 *
 *   Dzmitry Siarheyeu
 *   17.11.2020
 */

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        String in;

        Scanner input = new Scanner(System.in);

        System.out.println("The repetition of characters in the text twice");
        System.out.println("Input text:");

        in = input.nextLine();

        for(int i = 0; i < in.length(); i++){
            for(int j = i+1; j < in.length(); j++){
                if(in.charAt(i) == in.charAt(j)){
                    in = new StringBuilder(in).replace(j,j+1," ").toString();
                }
            }
        }

        in = in.replaceAll(" ", "");

        System.out.println("Result " + in);

        input.close();
    }
}
