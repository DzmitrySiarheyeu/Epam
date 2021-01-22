import java.util.Comparator;
import java.util.Scanner;

class Customer {

    private int id;
    private static int ID;

    private String name, surname, patronymic,
            address,
            credit_сard_number, account_number;

    public Customer(String name, String surname, String patronymic,
                    String address,
                    String credit_сard_number, String account_number) {
        id = ID++;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.credit_сard_number = credit_сard_number;
        this.account_number = account_number;
    }

    public String toString() {
        String string = "";
        string = string + id + ":" + name + " " + surname + " " + patronymic +
                " address: " + address + " credit card " + credit_сard_number + " №" +
                " " + account_number;
        return string;
    }

    public void print() {
        System.out.println(toString());
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_surname(String surname) {
        this.surname = surname;
    }

    public void set_patronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void set_address(String address_) {
        this.address = address;
    }

    public void set_credit_сard_number(String credit_сard_number) {
        this.credit_сard_number = credit_сard_number;
    }

    public void set_account_number(String account_number) {
        this.account_number = account_number;
    }

    public int get_id() {
        return id;
    }

    public String get_name() {
        return name;
    }

    public String get_surname() {
        return surname;
    }

    public String get_patronymic() {
        return patronymic;
    }

    public String get_address() {
        return address;
    }

    public String get_credit_сard_number() {
        return credit_сard_number;
    }

    public String get_account_number() {
        return account_number;
    }

    public static Customer setCustomer(Scanner input) {
        Customer customer = new Customer("", "", "", "", "", "");
        System.out.print("name: ");
        customer.name = input.next();
        System.out.print("surname: ");
        customer.surname = input.next();
        System.out.print("patronymic: ");
        customer.patronymic = input.next();
        System.out.print("address: ");
        customer.address = input.next();
        System.out.print("credit_сard_number: ");
        customer.credit_сard_number = input.next();
        System.out.print("account_number: ");
        customer.account_number = input.next();
        return customer;
    }

    public static class ByNameComparator implements Comparator< Customer > {
        @Override
        public int compare(Customer left, Customer right) {
            if (left.surname != right.surname)
                return left.surname.compareTo(right.surname);
            if (left.name != right.name)
                return left.name.compareTo(right.name);
            return left.patronymic.compareTo(right.patronymic);
        }
    }
}