import java.util.*;

public class FunctionFactorial {

    public static int factorial(int numberOne) {
        int factorial = 1;
        for (int i = 1; i <= numberOne; i++) {
            factorial = factorial * i;

        }
        return factorial;

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int facto = factorial(number);
        System.out.println(facto);

    }
}
