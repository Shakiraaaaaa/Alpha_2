import java.util.*;

public class CalculateSum {

    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int sum = calculateSum(numberOne, numberTwo);
        System.out.println("the sum is : " + sum);

    }
}
