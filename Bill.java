import java.util.*;
public class Bill {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int pen=scanner.nextInt();
        int pencil=scanner.nextInt();
        int eraser=scanner.nextInt();
        int total=pen+pencil+eraser;
        float Vat=total*(0.18f);
        float totalWithVat=total+Vat;
        System.out.println(total);
        System.out.println((float)Vat);
        System.out.println((float)totalWithVat);
    }
}
