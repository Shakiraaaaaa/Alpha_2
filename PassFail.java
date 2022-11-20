import java.util.*;
public class PassFail {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        String status=(number>33)?"pass":"fail";
        System.out.println(status);

    }
}
