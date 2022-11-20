import java.util.*;
public class Fever {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        double temparature=scanner.nextDouble();
        if(temparature>100)
        {
            System.out.println("you have a fever");
        }
        
        else
        {
            System.out.println("you do not have a fever");
        }
    }
}
