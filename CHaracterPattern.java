public class CHaracterPattern {
    public static void main(String args[]) {
        int number = 10;
        char ch = 'A';
        for(int line=1;line<=number;line++)
        {
            for(int chars=1;chars<=line;chars++)
            {
                System.out.print(ch);
                ch++;
            }
        System.out.println();
        }
    }
}
