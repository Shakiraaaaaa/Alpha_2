public class HollowRactangle {

    public static void hollowRactangle(int totalRows, int totalColumn) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalColumn; j++) {
                if (i == 1 || i == totalRows || j == 1 || j == totalColumn) {
                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollowRactangle(3, 3);

    }
}
