public class NumberPyramid {

    public static void numberPyramid(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i + 1; j++) {
                System.out.print(j);

            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        numberPyramid(5);

    }
}
