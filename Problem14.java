import java.util.*;

public class Problem14 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 2; i <= (number - 1); i++) {
            if (number == 2) {
                System.out.println("prime number");
            }

            else if (number % i == 0) {
                System.out.println("not prime  number");
            }
        }
    }
}
