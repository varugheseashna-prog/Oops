package lab1;

public class FactorialWhile {
    public static void main(String[] args) {
        int number = 5;
        long factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
