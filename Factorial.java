import java.util.*;
public class Factorial {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;
        for(int i=number; i>=1;i--)
        {
            factorial = factorial * i;
        }
        System.out.println("factorial : "+factorial);
    }
}
