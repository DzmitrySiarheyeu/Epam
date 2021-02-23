/*
 *   Задание: Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом
 *   три различных операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать
 *   слова по длине; отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в
 *   случае равенства – по алфавиту.
 *
 *   Dzmitry Siarheyeu
 *   23.02.2021
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static Scanner input = new Scanner(System.in);
    private static String in, text;

    public static void main(String[] args) {


        int act;

        System.out.println("Input text:");

        getText();

        while (true){
            outputAction();

            act = input.nextInt();

            while (act >= 6 || act < 0){
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
                    getParagraph(text);
                    break;
                case 2:
                    getSortingSentence(text);
                    break;
                case 3:
                    System.out.println("Enter character:");
                    sortWordsByNumberOfOccurrencesDescendingInSentences(text, getChar());
                    break;
                case 4:
                    System.out.println(text);
                    break;
                case 5:
                    getText();
                    break;
            }
        }

    }

    private static void getText() {
        in = input.nextLine();

        text = in;
    }

    private static char getChar() {
        return input.next().charAt(0);
    }


    public static void sortWordsByNumberOfOccurrencesDescendingInSentences(String sentenc , char symbol)
    {
        /* Сортирует слова в предложении по убыванию количества вхождений заданного символа. Если количество вхождений
           у слов одинаковое, то сортирует слова по алфавиту. */
        ArrayList<String> sortedSentences = new ArrayList<>();
        Pattern patternForSearchSentences = Pattern.compile("[^.!?]+?[.!?]+");
        String pattern = String.valueOf(symbol) + "+";
        Pattern patternForSearchSymbolInWord = Pattern.compile(pattern);
        Matcher matcherForSearchSentences = patternForSearchSentences.matcher(sentenc);
        while (matcherForSearchSentences.find()) {
            String sentence = matcherForSearchSentences.group();
            ArrayList<String> allPunctuationInSentence = getAllPunctuations(sentence);
            ArrayList<String> allWordsInSentence = getAllWords(sentence);
            ArrayList<Integer> numbersOfOcurrences = new ArrayList<>();
            for (String word : allWordsInSentence)
            {
                Matcher matcherForSearchSymbol = patternForSearchSymbolInWord.matcher(word);
                int count = 0;
                while (matcherForSearchSymbol.find())
                {
                    count++;
                }
                numbersOfOcurrences.add(count);
            }
            for (int k = 0; k < numbersOfOcurrences.size(); k++)
            {
                for (int j = 0; j < numbersOfOcurrences.size() - 1 - k; j++)
                {
                    if (numbersOfOcurrences.get(j) < numbersOfOcurrences.get(j + 1))
                    {
                        int temp1 = numbersOfOcurrences.get(j);
                        numbersOfOcurrences.set(j, numbersOfOcurrences.get(j + 1));
                        numbersOfOcurrences.set(j + 1, temp1);
                        String temp2 = allWordsInSentence.get(j);
                        allWordsInSentence.set(j, allWordsInSentence.get(j + 1));
                        allWordsInSentence.set(j + 1, temp2);
                    }
                    else if (numbersOfOcurrences.get(j).equals(numbersOfOcurrences.get(j + 1)))
                    {
                        if (allWordsInSentence.get(j).toLowerCase().compareTo(allWordsInSentence.get(j + 1).toLowerCase()) > 0)
                        {
                            String temp = allWordsInSentence.get(j);
                            allWordsInSentence.set(j, allWordsInSentence.get(j + 1));
                            allWordsInSentence.set(j + 1, temp);
                        }
                    }
                }
            }
            for (int i = 1 + allWordsInSentence.size() - allPunctuationInSentence.size(), j = 0; j < allPunctuationInSentence.size(); j++, i++)
                allWordsInSentence.add(i + j, allPunctuationInSentence.get(j));
            sortedSentences.add(String.join("", allWordsInSentence));
        }
       System.out.println(String.join("", sortedSentences));
    }

    private static ArrayList<String> getAllWords(String text)
    {
        // Возвращает список всех слов в строке.
        ArrayList<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
        {
            words.add(matcher.group());
        }
        return words;
    }

    private static ArrayList<String> getAllPunctuations(String text)
    {
        // Возвращает список всех знаков пунктуации в строке.
        ArrayList<String> punctuation = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\W+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
        {
            punctuation.add(matcher.group());
        }
        return punctuation;
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
                "\n4 - Output text; " +
                "\n3 - Input new text; " +
                "\n0 - Exit.");
    }
}