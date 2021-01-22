import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int A, B;

        Scanner input = new Scanner(System.in);

        System.out.println("Finding the greatest common divisor and least common multiple");

        System.out.println("Input A and B: ");

        A = input.nextInt();
        B = input.nextInt();

        System.out.println("Greatest common divisor: " + gcd(A, B));
        System.out.println("Least common multiple: " + lcm(A, B));

        input.close();

    }

    public static int lcm(int a,int b){
        return (a * b) / gcd(a,b);
    }

    public static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }
}
