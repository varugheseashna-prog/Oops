package lab1;

public class GCDWhile {
    public static void main(String[] args) {
        int a = 56;
        int b = 98;

        int num1 = a;
        int num2 = b;

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        System.out.println("GCD of " + a + " and " + b + " is: " + num1);
    }
}