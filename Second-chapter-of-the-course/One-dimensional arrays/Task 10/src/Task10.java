import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        int n, size;
        ArrayList<Integer> array = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Compressing an array by throwing out every second element");
        System.out.println("Input n:");

        n = input.nextInt();

        for(int i = 0; i < n; i++){
            array.add(random.nextInt(1000));
        }

        System.out.println("Array: " + array);

        size = array.size()/2;

        for (int i = 1; i <=size; i++){
            array.remove(array.size()-i);
        }

        System.out.print("\nThe compressed array: " + array);

        input.close();

    }
}
