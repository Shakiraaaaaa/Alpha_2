import java.util.*;
public class Ternary {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        String type=(number%2==0)?"even":"odd";
        System.out.println(type);
    }
}
