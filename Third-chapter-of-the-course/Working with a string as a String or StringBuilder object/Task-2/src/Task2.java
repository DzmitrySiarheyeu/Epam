import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        String in;

        Scanner input = new Scanner(System.in);

        System.out.println("Inserting the 'b' character after each 'a' character");
        System.out.println("Input text:");

        in = input.nextLine();

        for(int i = 0; i < in.length(); i++){
            if(in.charAt(i) == 'a') {
                in = new StringBuilder(in).insert(i+1, "b").toString();
            }
        }

        System.out.println("Result " + in);

        input.close();
    }
}
