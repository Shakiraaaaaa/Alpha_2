import java.util.*;

public class Problem6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int income = scanner.nextInt();
        float tax;
        if (income < 500000) {
            tax = 0;
        }

        else if (income > 1000000) {
            tax = (int) income * 0.2f;
        }

        else {
            tax = income * 0.3f;
        }

        System.out.println(tax);

    }
}
