import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonaci");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = input.nextInt();
        System.out.println(fibonacciSum(a));
        input.close();

    }

    public static int fibonacciSum(int a) {
        if (a <= 1) {
            return a;
        }

        int sum = fibonacciSum(a - 1) + fibonacciSum(a - 2);

        return sum;

    }
}
