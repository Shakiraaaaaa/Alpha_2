public class ArrayLargest {

    public static int largest(int numbers[]) {

        int largestt = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largestt < numbers[i]) {
                largestt = numbers[i];
            }
        }

        return largestt;
    }

    public static void main(String args[]) {

        int numbers[] = { 2, 3, 4, 5, 5, 6, 75, 65, 4, 53 };
        int large = largest(numbers);
        System.out.println(large);

    }
}
