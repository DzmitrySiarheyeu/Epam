import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        int n;
        int[][] array;

        Scanner input = new Scanner(System.in);

        System.out.println("Creating a square matrix based on a sample");
        System.out.println("Input n:");

        n = input.nextInt();

        while(chek(n)){
            System.out.print("n is odd number, enter n: ");
            n = input.nextInt();
        }

        array = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                if(j<=n-1-i){
                    array[i][j] = i+1;

                }
                System.out.printf("%4d", array[i][j]);
            }
            System.out.print("\n");
        }

        input.close();

    }

    public static boolean chek(int x) {
        if(x%2 != 0){
            return true;
        }else return false;
    }
}
