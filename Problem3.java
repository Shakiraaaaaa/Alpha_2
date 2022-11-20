import java.util.*;

public class Problem3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int pen = scanner.nextInt();
        int pencil = scanner.nextInt();
        int eraser = scanner.nextInt();
        int totalPrice = pen + pencil + eraser;
        System.out.println("total " + totalPrice);
        float tax = totalPrice * 1.8f;
        System.out.println("tax " + tax);
        float totalPriceWithTax = totalPrice + tax;
        System.out.println("total price with tax " + totalPriceWithTax);

    }
}
