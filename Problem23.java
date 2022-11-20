
//factorial with function
import java.util.*;

public class Problem23 {

    public static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static int binomialCoefficient(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_minus_r = factorial(n - r);
        int binomialCoefficientt = fact_n / (fact_r * fact_n_minus_r);
        return binomialCoefficientt;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int facto = factorial(numberOne);
        // System.out.println(facto);
        int binCoff = binomialCoefficient(numberOne, numberTwo);
        System.out.println(binCoff);

    }
}
