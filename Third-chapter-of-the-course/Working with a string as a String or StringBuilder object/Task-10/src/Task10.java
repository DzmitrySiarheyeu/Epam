/*
 *   Задание: Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
 *   восклицательным или вопросительным знаком. Определить количество предложений в строке X.
 *
 *   Dzmitry Siarheyeu
 *   22.02.2021
 */

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        String in;
        int countSentences = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Determining the number of sentences in a line");
        System.out.println("Input text:");

        in = input.nextLine();

        for(int i = 1; i < in.length(); i++){
            if(String.valueOf(in.charAt(i)).matches("[.!?]") && !String.valueOf(in.charAt(i-1)).matches("[.!?]")){
                countSentences++;
            }
        }

        System.out.printf("In line %d of the sentence", countSentences);

        input.close();
    }
}
