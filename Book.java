package assignment;

import java.util.Scanner;

public class Book {

    String title;
    String author;
    double price;

   
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    void displayBook() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println();
    }

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book 1 Details");
        System.out.print("Title: ");
        String title1 = sc.nextLine();

        System.out.print("Author: ");
        String author1 = sc.nextLine();

        System.out.print("Price: ");
        double price1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nEnter Book 2 Details");
        System.out.print("Title: ");
        String title2 = sc.nextLine();

        System.out.print("Author: ");
        String author2 = sc.nextLine();

        System.out.print("Price: ");
        double price2 = sc.nextDouble();

        Book b1 = new Book(title1, author1, price1);
        Book b2 = new Book(title2, author2, price2);

        System.out.println("\nBook 1 Details");
        b1.displayBook();

        System.out.println("Book 2 Details");
        b2.displayBook();

        sc.close();
    }
}