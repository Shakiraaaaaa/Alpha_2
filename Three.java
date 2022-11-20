import java.util.*;
public class Three {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int numberOne=scanner.nextInt();
        int numberTwo=scanner.nextInt();
        int numberThree=scanner.nextInt();
        if(numberOne>numberTwo && numberOne>numberThree)
        {
            System.out.println("Number one is largest");
        }
        else if(numberTwo>numberThree)
        {
            System.out.println("Number two is largest");

        }
        else
        {
            System.out.println("number three is largest");
        }
    }
}
