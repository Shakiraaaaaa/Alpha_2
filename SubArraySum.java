public class SubArraySum {

    public static void subArraySum(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    // System.out.print(numbers[k] + " ");
                    currentSum += numbers[k];
                }
                System.out.println(currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }

            System.out.println("max sum" + maxSum);
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subArraySum(numbers);
    }
}
