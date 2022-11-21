public class Diamond {

    public static void diamond(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= (number - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= (number - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        diamond(4);
    }
}
