public class Rhombous {

    public static void rhombous(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= (number - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= number; j++) {
                if (i == 1 || i == number || j == 1 || j == number) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        rhombous(5);
    }
}
