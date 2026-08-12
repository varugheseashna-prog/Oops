package testpackage;

import tutorial6.Employee;

public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee();

        System.out.println(emp.salary);
        emp.showSalary();
    }
}