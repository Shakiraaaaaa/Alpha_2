import java.util.*;

public class Problem29 {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < (numbers[i])) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static void main(String args[]) {

        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int large = getLargest(numbers);
        System.out.println(large);

    }
}
