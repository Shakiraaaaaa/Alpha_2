public class Pairs {

    public static void pairs(int numbers[]) {
        int totalPair = 0;
        for (int i = 0; i <= numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                System.out.print("(" + current + "," + numbers[j] + ")");
            }

            System.out.println();
        }

    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        pairs(number);

    }
}
