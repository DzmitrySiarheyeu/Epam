import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        ArrayList<String> camelCase = new ArrayList<>();

        System.out.println("Converting camelCase to snake_case");
        System.out.println("Input camelCase:");

        Scanner input = new Scanner(System.in);

        camelCase.add(input.next());

        while (!camelCase.get(camelCase.size()-1).equals("0")){
            System.out.println("Input the following camelCase or 0 to complete the input");
            camelCase.add(input.next());
        }
        camelCase.remove(camelCase.size()-1);

        for (int i = 0; i< camelCase.size(); i++) {
            camelCase.set(i,toSnakeCase(camelCase.get(i)));
        }

        System.out.print("The transformed array: " + camelCase);

        input.close();
    }

    public static String toSnakeCase(String str)
    {
        String result = "";

        char c = str.charAt(0);
        result = result + Character.toLowerCase(c);

        for (int i = 1; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result = result + '_';
                result
                        = result
                        + Character.toLowerCase(ch);
            }

            else {
                result = result + ch;
            }
        }

        return result;
    }
}
