import java.util.*;

public class Marks {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int marks[] = new int[100];
        marks[0] = scanner.nextInt();
        marks[1] = scanner.nextInt();
        marks[2] = scanner.nextInt();
        marks[3] = scanner.nextInt();

        System.out.println("listening" + marks[0]);
        System.out.println("reading" + marks[1]);
        System.out.println("writing" + marks[2]);
        System.out.println("speaking" + marks[3]);

        marks[2] = marks[2] + 1;
        System.out.println(marks[2]);
    }
}
