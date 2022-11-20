import java.util.*;

public class FuctionEven {

    public static boolean isEven(int num) {
        boolean isEvenn = true;
        if (num % 2 != 0) {
            isEvenn = false;
        }

        return isEvenn;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isEven(number));
    }
}
