import java.util.*;

public class Problem22 {

    public static int product(int numberOne, int numberTwo) {
        int productt = numberOne * numberTwo;
        return productt;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int product = product(numberOne, numberTwo);
        System.out.println(product);
    }
}
