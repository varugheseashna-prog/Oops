package assignment;

import java.util.Scanner;

public class Marks {

    int mark1, mark2, mark3;

    // Constructor
    Marks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate total
    int total() {
        return mark1 + mark2 + mark3;
    }

    // Method to calculate average
    double average() {
        return total() / 3.0;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        Marks student = new Marks(m1, m2, m3);

        System.out.println("\nStudent Result");
        System.out.println("Total = " + student.total());
        System.out.println("Average = " + student.average());

        sc.close();
    }
}