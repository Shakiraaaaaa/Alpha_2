public class SubArraySumKadane {

    public static void kadane(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            currentSum = currentSum + numbers[i];
            if (currentSum < 0) {
                currentSum = 0;
            }

        }
        System.out.println("max sum" + maxSum);
    }

    public static void main(String args[]) {

        int numbers[] = { 2, -3, 4, -1, -2, 1, 5, -3 };
        kadane(numbers);

    }
}
