import java.util.*;
public class Calculator {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number : ");
        int numberOne=scanner.nextInt();
        System.out.println("enter second number : ");
        int numberTwo=scanner.nextInt();
        System.out.println("enter operator");
        int operator=scanner.next().charAt(0);
        switch(operator)
        {
            case '+': 
            System.out.println(numberOne+numberTwo);
            break;
            case '-': 
            System.out.println(numberOne-numberTwo);
            break;
            case '*': 
            System.out.println(numberOne*numberTwo);
            break;
            case '/': 
            System.out.println(numberOne/numberTwo);
            break;
            case '%': 
            System.out.println(numberOne%numberTwo);
            break;
        }
    }
}
