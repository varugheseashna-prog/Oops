package lab1;

public class ReverseNumberFor {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = 0;

        for (int temp = number; temp != 0; temp /= 10) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}