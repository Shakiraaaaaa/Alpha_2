import java.util.*;
public class PositiveNagetive {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if(number>0)
        {
            System.out.println("the number is positive");
        }

        else
        {
            System.err.println("the number is negattive");
        }
    }
}
