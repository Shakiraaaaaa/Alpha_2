import java.util.*;

public class Problem21 {

    public static int sum(int numberOnee, int numberTwoo) {
        int sum = numberOnee + numberTwoo;
        return sum;

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int sum = sum(numberOne, numberTwo);
        System.out.println(sum);
    }
}
