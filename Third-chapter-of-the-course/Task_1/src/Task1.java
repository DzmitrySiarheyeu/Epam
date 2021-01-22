import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task1 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String in;
        int act;

        System.out.println("Input text:");

        in = input.nextLine();

        while (true){
            outputAction();

            act = input.nextInt();

            while (act >= 4 || act < 0){
                System.out.println("Invalid value");
                outputAction();
                act = input.nextInt();
            }

            switch (act){
                case 0:
                    input.close();
                    System.exit(0);
                    break;
                case 1:
                    getParagraph(in);
                    break;
                case 2:
                    getSortingSentence(in);
                    break;
                case 3:
                    getSortingTokens(in);
                    break;
            }
        }

    }

    private static void getSortingTokens(String in) {

    }



    private static void getSortingSentence(String in) {
        String[] sentences = in.split("[.!?]\\s*");
        String[][] words = new String[sentences.length][];

        for (int i = 0; i < sentences.length; ++i) {
            words[i] = sentences[i].split("[\\p{Punct}\\s]+");
        }

        Comparator<String> stringLengthComparator = new StringLengthSort();

        for (String[] word : words) {
            Arrays.sort(word, stringLengthComparator);
        }

        for (String[] word : words) {
            for (String s : word) {
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }

    }

    static class StringLengthSort implements Comparator<String>{
        public int compare(String in1, String in2) {
            return Integer.compare(in1.length(), in2.length());
        }
    }


    private static void getParagraph(String in) {

        int num;

        String[] sentences = in.split("(?<=\\. |! |\\? )");

        System.out.println("Input the number of offers:");
        num = input.nextInt();


        while (num < 1 || num > sentences.length){
            if(num < 1){
                System.out.println("The number of offers cannot be less than 1");
            }else {
                System.out.println("The number of sentences may not exceed the number of sentences in the text");
            }
            System.out.println("Input the number of offers:");
            num = input.nextInt();
        }

        for(int i = 0; i < sentences.length; i++){

           System.out.print(sentences[i]);

            if(i == num-1){
                System.out.print("\n");
                num += num;
            }
        }

    }

    private static void outputAction() {
        System.out.println("\nSelect an action: " +
                "\n1 - Sorting paragraphs by number of sentences; " +
                "\n2 - Sorting words by length in a sentence; " +
                "\n3 - Sorting tokens in descending order; " +
                "\n0 - Exit.");
    }
}
