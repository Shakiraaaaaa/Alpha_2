import java.util.*;

public class ArrayCC {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // int marks[] = new int[50];

        // marks[0] = 90;
        // marks[1] = 92;
        // marks[2] = 94;

        // marks[0] = scanner.nextInt();
        // marks[1] = scanner.nextInt();
        // marks[2] = scanner.nextInt();

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        int marks[] = { 90, 92, 94 };
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();
    }

}
