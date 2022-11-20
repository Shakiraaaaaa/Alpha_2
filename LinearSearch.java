public class LinearSearch {

    public static int search(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return number[i];
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 1, 2, 4, 6, 10, 60, 40 };
        int key = 10;
        int index = search(number, key);

        if (index == -1) {
            System.out.println("not found");
        }

        else {
            System.out.println(index);
        }

    }
}
