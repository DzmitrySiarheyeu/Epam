/*
 *   Задание: Натуральное число в записи которого n цифр, называют числом Армстронга, если сумма его цифр,
 *   возведенная в степеть n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 *   использовать декомпозицию.
 *
 *   Dzmitry Siarheyeu
 *   11.11.2020
 */

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Task14 {

    public static void main(String[] args) {

        int k;
        ArrayList<Integer> array, arrAmstrong;

        array = new ArrayList<Integer>();
        arrAmstrong = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);

        System.out.println("Search for Amstrong numbers\nInput k:");

        k = input.nextInt();

        while (chek(k)){
            System.out.println("The number must be greater than 1\nInput k: ");
        }

        array = fillingArray(k);

        arrAmstrong = findNumAmst(array);

        System.out.println("Numbers Amstrong: " + arrAmstrong);


        input.close();

    }



    private static ArrayList<Integer> findNumAmst(ArrayList<Integer> array) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < array.size(); i++){
            if(chekNum(array.get(i))){
                arr.add(array.get(i));
            }
        }
        return arr;
    }

    private static boolean chekNum(int i) {
        ArrayList<Integer> arr = splitNum(i);
        int temp = sumNum(arr);

        if(temp == i) return true;
        else return false;
    }

    private static int sumNum(ArrayList<Integer> arr) {
        int temp = 0;
        for(int j = 0; j< arr.size(); j++){
            temp += pow(arr.get(j),arr.size());
        }
        return temp;
    }

    private static ArrayList<Integer> splitNum(int i) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (i>0){
            arr.add(i%10);
            i = i/10;
        }
        return arr;
    }

    private static ArrayList<Integer> fillingArray(int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < k; i++){
            arr.add(i,i + 1);
        }
        return arr;
    }

    private static boolean chek(int n) {
        if(n < 1) return true;
        else return false;
    }
}
