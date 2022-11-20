import java.util.*;

public class CalculateProduct {

    public static int calculateProduct(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int product = calculateProduct(numberOne, numberTwo);
        System.out.println(product);

    }
}
