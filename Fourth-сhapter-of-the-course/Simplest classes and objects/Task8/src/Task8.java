import java.util.Scanner;

public class Task8 {

    private static Scanner input = new Scanner(System.in);
    private static Customers customers = new Customers(1);

    public static void main(String[] args) {
        System.out.print("Customers");

        while (true) {
            System.out.print("\nSelect an action" +
                    "\n1 - Add customer" +
                    "\n2 - Output customers in alphabetical order" +
                    "\n3 - Output of customers with a credit card in the interval" +
                    "\n4 - Get customers" +
                    "\n0 - Exit\n");

            switch (input.nextInt()) {
                case 0:
                    input.close();
                    System.exit(0);
                    break;
                case 1:
                    AddCustomer();
                    break;
                case 2:
                    outputCustomersAlphaOrder();
                    break;
                case 3:
                    outputCustomersWithCreditCard();
                    break;
                case 4:
                    getCustomers();
                    break;
            }
        }
    }

    private static void getCustomers() {
        System.out.println("Customers:");
        customers.print();
    }

    private static void outputCustomersWithCreditCard() {
        System.out.println("Enter a range of credit cards\n");
        System.out.println("From: ");
        String from = input.next();
        System.out.println("Before: ");
        String to = input.next();
        customers.print_if_card_in(from, to);
    }

    private static void outputCustomersAlphaOrder() {
        customers.sortByName();
        customers.print();
    }

    private static void AddCustomer() {
        customers.push_back(Customer.setCustomer(input));
    }
}
