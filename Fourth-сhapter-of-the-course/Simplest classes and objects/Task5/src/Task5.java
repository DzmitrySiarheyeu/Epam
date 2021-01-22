import java.util.Scanner;

public class Task5 {

    private static Scanner input = new Scanner(System.in);
    private static Counter counter;

    public static void main(String[] args) {

        System.out.println("Counter");

        while (true){
            System.out.print("\nSelect an action" +
                    "\n1 - Set the counter value (min, max, current)" +
                    "\n2 - Set the counter value (min, max)" +
                    "\n3 - Set the standard value" +
                    "\n4 - Set a random value" +
                    "\n5 - Add value" +
                    "\n6 - Take away the value" +
                    "\n7 - Get counter" +
                    "\n0 - Exit\n");

            switch (input.nextInt()){
                case 0:
                    input.close();
                    System.exit(0);
                    break;
                case 1:
                    setCounterValueThree();
                    break;
                case 2:
                    setCounterValueTwo();
                    break;
                case 3:
                    setStandardValue();
                    break;
                case 4:
                    setRandomValue();
                    break;
                case 5:
                    addValue();
                    break;
                case 6:
                    takeAwayValue();
                    break;
                case 7:
                    getCounter();
                    break;
            }
        }

    }

    private static void getCounter() {
        System.out.println("Current counter value: " + counter.value());
    }

    private static void takeAwayValue() {
        counter.dec();
    }

    private static void addValue() {
        counter.inc();
    }

    private static void setRandomValue() {

        int limit;

        System.out.println("Enter the limit value of the counter");

        limit = input.nextInt();

        counter = new Counter(limit);
    }

    private static void setStandardValue() {
        counter = new Counter();
    }

    private static void setCounterValueTwo() {
        int min, max;

        System.out.println("Enter the minimum and maximum value of the counter");

        min = input.nextInt();
        max = input.nextInt();

        counter = new Counter(min, max);
    }

    private static void setCounterValueThree() {

        int min, max, current;

        System.out.println("Enter the minimum, maximum, and current value of the counter");

        min = input.nextInt();
        max = input.nextInt();
        current = input.nextInt();

        counter = new Counter(min, max, current);
    }
}

