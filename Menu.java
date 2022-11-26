public class Menu {

    public static String menuSearch(String menus[], String menu) {
        for (int i = 0; i <= menus.length; i++) {
            if (menus[i] == menu) {
                System.err.println(i);
            }

            else {
                System.out.println("not present");
            }
        }

        return menu;
    }

    public static void main(String args[]) {
        String menus[] = { "biryani", "burger", "momo", "pizza", "pasta" };
        String menu = "burger";
        String index = menuSearch(menus, menu);
        System.out.println("menu is at" + index);
    }
}
