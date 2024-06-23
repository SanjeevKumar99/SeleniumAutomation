
import java.util.Scanner;

public class FactorialSeriesSum {

    // Function to calculate factorial of a number
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n (number of terms): ");
        int n = scanner.nextInt();
        
        double sum = 0.0;

        // Calculate each term of the series
        for (int i = 1; i <= n; i++) {
            long factorial1 = factorial(11 - i);
            long factorial2 = factorial(10 - i);
            long factorial3 = factorial(i);

            double term = (factorial1 - factorial2) / (double) factorial3;
            sum += term;
        }

        System.out.println("Sum of the series S = " + sum);

        scanner.close();
    }
}
