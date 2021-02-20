/*
 *   Задание: Написать метод(методы), проверяющие, являются ли данные три числа
 *   взаимно простыми.
 *
 *   Dzmitry Siarheyeu
 *   20.02.2021
 */

import java.util.Scanner;

public class Task6 {


    public static void main(String[] args) {

        int A, B, C;

        Scanner input = new Scanner(System.in);

        System.out.println("The definition of relatively prime numbers");

        System.out.print("Input A, B, C: ");

        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();


        if(findRelatPrimeNum(A, B, C)){
            System.out.print("Numbers are mutually prime");
        }else System.out.print("Numbers are not mutually prime");

        input.close();

    }

    private static boolean findRelatPrimeNum(int a, int b, int c) {
        return gcd(a, b) == 1 && gcd(a, c) == 1 && gcd(b, c) == 1;
    }


    public static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }
}
