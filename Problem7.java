import java.util.*;

public class Problem7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        if (numberOne > numberThree && numberOne > numberThree) {
            System.out.println("a is greater");
        }

        else if (numberTwo > numberThree) {
            System.out.println("b is greater");
        }

        else {
            System.out.println("c is greater");
        }
    }
}
