import java.util.*;

public class Palindrome {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number > 0) {
            int lastDigit = number % 10;
            System.out.println(lastDigit);
            number = number / 10;

            if (lastDigit == number) {
                System.out.println("paindrone number");
            }
        }

    }
}
