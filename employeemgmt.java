package tutorial7;

import java.util.Scanner;

class Employee {
    String name, address;
    int age, mob;
    float sal;

    Employee(String name, String address, int age, int mob, float sal) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mob = mob;
        this.sal = sal;
    }

    void printSalary() {
        System.out.println("Salary: " + sal);
    }
}

class Officer extends Employee {
    String specialization;

    Officer(String name, String address, int age, int mob,
            float sal, String specialization) {
        super(name, address, age, mob, sal);
        this.specialization = specialization;
    }

    void printSpecialization() {
        System.out.println("Specialization: " + specialization);
    }

    void display() {
        System.out.println("\n---OfficerDetails---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Mobile: " + mob);
        printSalary();
        printSpecialization();
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, String address, int age, int mob,
            float sal, String department) {
        super(name, address, age, mob, sal);
        this.department = department;
    }

    void printDepartment() {
        System.out.println("Department: " + department);
    }

    void display() {
        System.out.println("\n---ManagerDetails---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Mobile: " + mob);
        printSalary();
        printDepartment();
    }
}

public class employeemgmt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Officer's Name: ");
        String oname = sc.nextLine();

        System.out.print("Enter Address: ");
        String oaddress = sc.nextLine();

        System.out.print("Enter Age: ");
        int oage = sc.nextInt();

        System.out.print("Enter Mobile: ");
        int omob = sc.nextInt();

        System.out.print("Enter Salary: ");
        float osal = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();

        Officer o = new Officer(
            oname, oaddress, oage, omob, osal, specialization
        );

        System.out.print("\nEnter Manager's Name: ");
        String mname = sc.nextLine();

        System.out.print("Enter Address: ");
        String maddress = sc.nextLine();

        System.out.print("Enter Age: ");
        int mage = sc.nextInt();

        System.out.print("Enter Mobile: ");
        int mmob = sc.nextInt();

        System.out.print("Enter Salary: ");
        float msal = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        Manager m = new Manager(
            mname, maddress, mage, mmob, msal, department
        );

        o.display();
        m.display();

        sc.close();
    }
}
