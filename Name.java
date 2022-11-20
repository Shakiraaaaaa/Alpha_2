import java.util.Scanner;

public class Name {

    public static String fullName(String fname, String lname) {
        String fullName = fname + " " + lname;
        return fullName;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String fullname = fullName(firstName, lastName);
        System.out.println(fullname);

    }
}
