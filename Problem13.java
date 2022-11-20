import java.util.*;

public class Problem13 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            reverse = (reverse * 10) + lastDigit;
            System.out.println(reverse);
        }
    }
}
