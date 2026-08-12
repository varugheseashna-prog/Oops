package tutorial7;
import java.util.Scanner;

class Students {
    String name, rollNo, course;

    Students(String name, String rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void setDetails(String name, String rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class StudentAccount extends Students {
    double collegeFee;

    StudentAccount(String name, String rollNo, String course, double collegeFee) {
        super(name, rollNo, course);
        this.collegeFee = collegeFee;
    }

    void setDetails(String name, String rollNo, String course, double collegeFee) {
        super.setDetails(name, rollNo, course);
        this.collegeFee = collegeFee;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("CollegeFee: " + collegeFee);
    }
}

class Hosteller extends StudentAccount {
    double hostelFee;
    double messFee;

    Hosteller(String name, String rollNo, String course,
              double collegeFee, double hostelFee, double messFee) {
        super(name, rollNo, course, collegeFee);
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }

    void displayDetails() {
        System.out.println("\n---HOSTELLERDETAILS---");
        super.displayDetails();
        System.out.println("HostelFee: " + hostelFee);
        System.out.println("MessFee: " + messFee);
        System.out.println("TotalFee: " +
                (collegeFee + hostelFee + messFee));
    }
}

class DayScholar extends StudentAccount {
    double busFee;

    DayScholar(String name, String rollNo, String course,
               double collegeFee, double busFee) {
        super(name, rollNo, course, collegeFee);
        this.busFee = busFee;
    }

    void displayDetails() {
        System.out.println("\n---DAYSCHOLARDETAILS---");
        super.displayDetails();
        System.out.println("BusFee: " + busFee);
        System.out.println("TotalFee: " +
                (collegeFee + busFee));
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Hosteller
        System.out.print("Enter Hosteller's Name: ");
        String hname = sc.nextLine();

        System.out.print("Enter RollNo: ");
        String hroll = sc.nextLine();

        System.out.print("Enter Course: ");
        String hcourse = sc.nextLine();

        System.out.print("Enter CollegeFee: ");
        double hcollegeFee = sc.nextDouble();

        System.out.print("Enter HostelFee: ");
        double hostelFee = sc.nextDouble();

        System.out.print("Enter MessFee: ");
        double messFee = sc.nextDouble();
        sc.nextLine();

        Hosteller h = new Hosteller(
                hname, hroll, hcourse,
                hcollegeFee, hostelFee, messFee
        );

        // Day Scholar
        System.out.print("\nEnter DayScholar's Name: ");
        String dname = sc.nextLine();

        System.out.print("Enter RollNo: ");
        String droll = sc.nextLine();

        System.out.print("Enter Course: ");
        String dcourse = sc.nextLine();

        System.out.print("Enter CollegeFee: ");
        double dcollegeFee = sc.nextDouble();

        System.out.print("Enter BusFee: ");
        double busFee = sc.nextDouble();

        DayScholar d = new DayScholar(
                dname, droll, dcourse,
                dcollegeFee, busFee
        );

        // Display details
        h.displayDetails();
        d.displayDetails();

        sc.close();
    }
}