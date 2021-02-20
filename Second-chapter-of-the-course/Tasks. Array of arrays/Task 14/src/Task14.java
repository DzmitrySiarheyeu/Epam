/*
 *   Задание: Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 *   причем в каждом столбце число удиниц равно номеру столбца.
 *
 *   Dzmitry Siarheyeu
 *   19.02.2021
 */

import java.util.Random;
import java.util.Scanner;

public class Task14 {

    public static int[] inp;
    public static Random rnd = new Random();
    public static int genCount =0;

    public static void main(String[] args) {

        int n, m;
        int[][] array;


        Scanner input = new Scanner(System.in);

        System.out.println("Generating a random matrix with 1 in a column equal to the column number");
        System.out.println("Input m and n");

        m = input.nextInt();
        n = input.nextInt();

        while(n > m){
            System.out.println("The value of n cannot exceed the value of m\nInput m and n");
            m = input.nextInt();
            n = input.nextInt();
        }

        inp = new int[n+1];
        array = new int[m][n];

        System.out.println("Matrix: ");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                array[randomInt(n+1)-1][i] = 1;
            }
            inp = new int[n+1];
            genCount=0;
        }

        for(int i = 0; i < m; i++ ){
            for(int j = 0; j < n; j++){
                System.out.printf("%4d", array[i][j]);
            }
            System.out.print("\n");
        }

        input.close();

    }

    public static int randomInt(int in) {

        int count, gen;

        count = in;

        boolean check=true;

        while (genCount < count)
        {
            gen=rnd.nextInt(count);

            for (int j : inp) {

                if (j == gen) {
                    check = true;
                    break;
                } else check = false;
            }


            if (!check)
            {
                inp[genCount] = gen;
                genCount++;
                return gen;
            }
        }

        return 0;
    }

}
