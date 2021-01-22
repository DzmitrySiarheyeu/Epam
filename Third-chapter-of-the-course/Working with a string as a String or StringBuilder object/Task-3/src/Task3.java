import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        String in;

        Scanner input = new Scanner(System.in);

        System.out.println("Checking a word for palindrome");

        while (true) {
            System.out.println("Input word:");

            in = input.nextLine();

            if(in.equals("0")) break;

            if(in.equals(new StringBuilder(in).reverse().toString())) System.out.printf("The word \"%s\" is a palindrome\n", in);
            else System.out.printf("The word \"%s\" is not a palindrome", in);

        }

        input.close();
    }
}
