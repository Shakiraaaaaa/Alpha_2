import java.util.*;
public class OdddEven {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if(number%2==0)
        {
            System.out.println("Even number");
        }

        else
        {
            System.out.println("odd number");
        }
    }
}
