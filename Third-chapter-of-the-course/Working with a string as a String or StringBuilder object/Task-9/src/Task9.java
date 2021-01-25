/*
 *   Задание: Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
 *   учитывать только английские буквы.
 *
 *   Dzmitry Siarheyeu
 *   18.11.2020
 */

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        String in;
        int countLowerCase = 0, countUpperCase = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Counting lowercase and uppercase letters in the text");
        System.out.println("Input text:");

        in = input.nextLine();

        for(int i = 0; i < in.length(); i++){
            if(String.valueOf(in.charAt(i)).matches("[A-Z]")){
                countUpperCase++;
            }else if(String.valueOf(in.charAt(i)).matches("[a-z]")){
                countLowerCase++;
            }
        }

        System.out.printf("The text has %d uppercase letters and %d lowercase letters", countUpperCase, countLowerCase);

        input.close();
    }
}