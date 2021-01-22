import java.util.Scanner;

public class Book {

    private int id;
    private static int ID;

    private String title, author, publishingHouse, typeOfBinding;
    private int yearOfPublication, numberOfPages;
    private double price;

    public Book(String title, String author, String publishingHouse,
                int yearOfPublication, int numberOfPages, double price,
                String typeOfBinding){
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public String toStringAdvanced() {
        String string = "";
        string = string + "Id: " + id + ", title: " + title + ", Author: " + author + ", publishing house: "
                + publishingHouse + ", year of publication: " + yearOfPublication + ", number of pages: "
                + numberOfPages + ", price: " + price + ", type of binding: " + typeOfBinding;
        return string;
    }

    public String toString(){
        String string = "";
        string = string + id + " " + title + " " + author + " " + publishingHouse + " "
                + yearOfPublication + " " + numberOfPages + " " + price + " " + typeOfBinding;
        return string;
    }

    public void printAdvanced() {
        System.out.println(toStringAdvanced());
    }

    public void print() {
        System.out.println(toString());
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public static Book setCustomer(Scanner input) {
        Book book = new Book("", "", "", 0, 0, 0, "");
        System.out.print("Title: ");
        book.title = input.next();
        System.out.print("Author: ");
        book.author = input.next();
        System.out.print("Publishing house: ");
        book.publishingHouse = input.next();
        System.out.print("Year of publication: ");
        book.yearOfPublication = input.nextInt();
        System.out.print("Number of pages: ");
        book.numberOfPages = input.nextInt();
        System.out.print("Price: ");
        book.price = input.nextDouble();
        System.out.print("Type of binding: ");
        book.typeOfBinding = input.next();
        return book;
    }
}
