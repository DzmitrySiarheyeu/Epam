import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Test1 test1 = new Test1();

        Scanner input = new Scanner(System.in);

        System.out.print("Finding the sum and finding the largest value");

        while (true){
            System.out.print("\nInput 'a' and 'b' or 0 0 to exit\n");

            test1.a = input.nextInt();
            test1.b = input.nextInt();

            if(test1.a == 0 && test1.b == 0) break;

            System.out.print("Max value = " + test1.max() + "\nSum = " + test1.sum());
        }
    }
}
