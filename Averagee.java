import java.util.*;

public class Averagee {

    public static int averageNum(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        return average;

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        System.out.println("average of three number is : " + averageNum(numberOne, numberTwo, numberThree));

    }
}
