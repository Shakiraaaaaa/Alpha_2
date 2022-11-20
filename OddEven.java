import java.util.*;
public class OddEven {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        for(int i=1;i<=number;i+=2)
        {
            oddSum = oddSum + i;

        }

        for(int j=0;j<=number;j+=2)
        {
            evenSum = evenSum + j;
        }

        System.out.println("even sum :"+evenSum);
        System.out.println("odd sum :"+oddSum);
    }
}
