/*
 *   Задание: Дан целоцисленный массив с количеством элементов n. Сжать массив,
 *   выбросив их него каждый второй элемент (освободившиеся элементы заполнить нулями).
 *   Примечание. Дополнительный массив не использовать.
 *
 *   Dzmitry Siarheyeu
 *   17.02.2021
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        int n, size;
        ArrayList<Integer> array = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Compressing an array by throwing out every second element");
        System.out.println("Input n:");

        n = input.nextInt();

        for(int i = 0; i < n; i++){
            array.add(random.nextInt(1000));
        }

        System.out.println("Array: " + array);

        size = array.size()/2;

        for (int i = 1; i <=size; i++){
            array.remove(array.size()-i);
        }

        System.out.print("\nThe compressed array: " + array);

        input.close();

    }
}
