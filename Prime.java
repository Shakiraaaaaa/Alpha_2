import java.util.*;

public class Prime {

    public static boolean isPrime(int num) {
        boolean isPrimee = true;
        if (num == 2) {
            isPrimee = true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrimee = false;
            }
        }
        return isPrimee;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isPrime(number));

    }
}
