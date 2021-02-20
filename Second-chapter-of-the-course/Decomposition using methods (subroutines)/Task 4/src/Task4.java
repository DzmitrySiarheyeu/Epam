/*
 *   Задание:На плоскости заданы своими координатами n точек. Написать метод(методы),
 *   определяющие, между какими из пар точек самое большое расстояние. Указание.
 *   Координаты точек занесены в массив.
 *
 *   Dzmitry Siarheyeu
 *   20.02.2021
 */

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task4 {

    public static void main(String[] args) {

        int n;
        double[] max;
        double[][] array;

        Scanner input = new Scanner(System.in);

        System.out.println("Search for the most distant points");

        System.out.println("Input n: ");

        n = input.nextInt();

        array = new double[2][n];

        for(int i = 0; i < n; i++){

            System.out.printf("Input %d(x, y): ", i+1);

            array[0][i] = input.nextDouble();
            array[1][i] = input.nextDouble();

        }

        max = findMaxDistance(array);

        System.out.printf("The maximum distance %4.2f between the points %.0f(%4.2f, %4.2f) and %.0f(%4.2f, %4.2f)", max[0], max[1] + 1, array[0][(int)max[1]], array[1][(int)max[1]], max[2] + 1,array[0][(int)max[2]], array[1][(int)max[2]]);

        input.close();

    }

    private static double[] findMaxDistance(double[][] array) {

        double[] max = new double[3];
        double temp;

        for (int i = 0; i < array[0].length; i++){
            for (int j = 0; j < array[0].length; j++){
                temp = abs(array[0][i] - array[0][j]) + abs(array[1][i] - array[1][j]);
                if(max[0] < temp){
                    max[0] = temp;
                    max[1] = i;
                    max[2] = j;
                }
            }
        }

        return max;
    }


}
