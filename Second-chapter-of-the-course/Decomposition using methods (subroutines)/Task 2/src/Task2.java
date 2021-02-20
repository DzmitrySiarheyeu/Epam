/*
 *   Задание: Написать метод(методы) для нахождения наибольшего общего делителя
 *   четырех натуральных чисел
 *
 *   Dzmitry Siarheyeu
 *   20.02.2021
 */

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int A, B, C, D;

        Scanner input = new Scanner(System.in);

        System.out.println("Finding the greatest common divisor for four numbers");

        System.out.println("Input A, B, C, D: ");

        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();


        System.out.println("Greatest common divisor: " + gcdForFour(A, B, C, D));

        input.close();

    }

    public static int gcdForFour(int a, int b, int c, int d){
       return gcd(gcd(a, b), gcd(c, d));
    }

    public static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }
}
