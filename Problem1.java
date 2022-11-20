import java.util.*;

public class Problem1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        int average = (numberOne + numberTwo + numberThree) / 3;
        System.out.println("average of three number is : " + average);
    }
}
