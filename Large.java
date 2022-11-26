public class Large {

    public static int returnLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest > numbers[i]) {
                largest = numbers[i];
            }

            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
            return smallest;
        }

        return largest;

    }

    public static void main(String args[]) {

        int numbers[] = { 2, 3, 4, 95, 49, 34, 39, 59, 95, 60 };

        System.out.println(returnLargest(numbers));
    }
}
