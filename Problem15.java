import java.util.*;

public class Problem15 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;
            }

            else {
                oddSum = oddSum + i;
            }

        }

        System.out.println("even sum" + evenSum);
        System.out.println("odd sum " + oddSum);
    }
}
