public class Reverse {
    public static void main(String args[]) {
        int number = 1234567;
        while(number>0)
        {
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number = number / 10;
        }
        System.out.println();
    }
}
