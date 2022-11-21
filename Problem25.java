import java.util.*;

public class Problem25 {

    public static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;

            }

            else {
                return true;
            }
        }

        return isPrime(number);
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isPrime(num));
        primesInRange(num);
    }
}
