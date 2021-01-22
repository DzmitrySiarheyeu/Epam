import java.util.Scanner;

public class Task2 {

    private static Test2 test2 = new Test2();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Finding the sum and finding the largest value");

        while (true){
            System.out.print("\nSelect an action" +
                    "\n1 - Set value" +
                    "\n2 - Get value" +
                    "\n0 - Exit\n");

            switch (input.nextInt()){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    setValue();
                    break;
                case 2:
                    getValue();
                    break;
            }

        }
    }

    private static void getValue() {
        System.out.printf("\nThe current value of a = %d b = %d", test2.get_a(), test2.get_b());

    }

    private static void setValue() {
        System.out.print("\nInput 'a' and 'b'\n");

        test2.set_a(input.nextInt());
        test2.set_b(input.nextInt());
    }
}
