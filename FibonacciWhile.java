package lab1;

public class FibonacciWhile {
    public static void main(String[] args) {
        int maxLimit = 50;
        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + maxLimit + ": ");

        while (first <= maxLimit) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
