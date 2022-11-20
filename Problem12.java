import java.util.*;

public class Problem12 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number > 0) {
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number = number / 10;
        }
    }
}
