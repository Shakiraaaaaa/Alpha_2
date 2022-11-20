import java.util.*;
public class Break {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
       
        do
        {
            System.out.println("enter the number");
             int number = scanner.nextInt();
             if(number%10==0)
             {
                break;
             }
             System.out.println(number);

         } while (true);
    }
}
