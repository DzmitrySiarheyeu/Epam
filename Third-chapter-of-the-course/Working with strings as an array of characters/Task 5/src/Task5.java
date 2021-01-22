import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        String in;

        Scanner input = new Scanner(System.in);

        System.out.println("Restoring a string to its normal form");
        System.out.println("Input text:");

        in = input.nextLine();

        in = in.replaceAll("\\s+", " ");

        if(Character.isWhitespace(in.charAt(0))) in = in.substring(1);
        if(Character.isWhitespace(in.charAt(in.length()-1))) in = in.substring(0, in.length()-1);

        System.out.println("Result: " + in);

        input.close();
    }
}
