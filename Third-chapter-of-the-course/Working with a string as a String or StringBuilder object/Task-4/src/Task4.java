/*
 *   Задание: С помощью функции копирования и операции конкатенации составить из частей
 *   слова "информатика" слово "торт".
 *
 *   Dzmitry Siarheyeu
 *   15.11.2020
 */

public class Task4 {

    public static void main(String[] args) {

        String original = "информатика",
               info = "торт",
               newWord = "";

        System.out.println("Making the word \"торт\" from the word \"информатика\"");

        for(int i = 0; i < info.length(); i++){
            for (int j = 0; j < original.length(); j++){
                if(info.charAt(i) == original.charAt(j)) {
                    newWord = newWord.concat(String.valueOf(original.charAt(j)));
                    break;
                }
            }
        }

        System.out.print(newWord);
    }
}
