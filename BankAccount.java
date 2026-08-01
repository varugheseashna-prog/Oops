package assignment;

import java.util.Scanner;



public class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit amount
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("\nAccount Details");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, name, balance);

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        account.deposit(amount);
        account.displayDetails();

        sc.close();
    }
}
