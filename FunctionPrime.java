import java.util.*;

public class FunctionPrime {

    public static int isPrime(int num) {
        if (num == 2) {
            System.out.println("Prime number");
        }

        for (int i = 2; i <= (num - 1); i++) {
            if (num % i == 0) {
                System.out.println("not a prime number");

            }
            break;
        }
        return isPrime(num);

    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int prime = isPrime(number);
        System.out.println(prime);

    }
}
