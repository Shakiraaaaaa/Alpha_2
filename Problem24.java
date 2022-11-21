import java.util.*;

public class Problem24 {

    public static void prime(int number) {

        for (int i = 2; i <= number - 1; i++)

        {
            if (i == 2) {
                System.out.println("prime number");
            } else if (number % i == 0) {
                System.out.println("not a prime number");
            } else {
                System.out.println("prime number");
            }
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        prime(num);

    }
}
