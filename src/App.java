import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<FoodItem> menuList = new ArrayList<>();
    public static LinkedList<VoucherItem> voucherList = new LinkedList<>();
    public static void main(String[] args) {
        Admin admin = new Admin();
        
        while (true) {
            System.out.println("1. Customer");
            System.out.println("2. Admin");
            System.out.println("3. Exit");
            int option = sc.nextInt();

            if (option == 1) {
                customerPage();
            }

            else if (option == 2) {
                adminAuth(admin);
            }

            else {
                break;
            }
        }
    }

    private static void adminAuth(Admin admin) {
        clearConsole();
        ArrayList<Admin> adminList = admin.ReadAdminFile();
        
        while (true) {
            System.out.print("Enter your ID: ");
            String input = sc.next();

            boolean found = false;

            for (int i = 0; i < adminList.size(); i++) {
                Admin obj = adminList.get(i);
                if (obj.getAdminID().equals(input)) {
                    found = true;
                }
            }

            if (found) {
                adminPage(admin);
                break;
            }
            else {
                System.out.println("\nInvalid ID! please try again");
            }
        }
        return;
        
    }

    private static void adminPage(Admin admin) {
        while (true) {
           clearConsole();
            System.out.println("1. Add Menu");
            System.out.println("2. Remove Menu");
            System.out.println("3. Add Voucher");
            System.out.println("4. Remove Voucher");
            System.out.println("5. Log Out");
            int input = sc.nextInt();

            if (input == 1) {

                System.out.println("Enter the menu's ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the menu's name: ");
                String name = sc.nextLine();

                System.out.println("Enter the menu's price: ");
                double price = sc.nextDouble();

                FoodItem food = new FoodItem(id, name, price);

                admin.addMenu(food, menuList);
            }

            else if (input == 2) {
                System.out.println("Enter the menu's ID: ");
                int id = sc.nextInt();

                admin.removeMenu(id, menuList);
            }
            else if (input == 3) {
            }
            else if (input == 4) {
            }
            else {
                clearConsole();
                break;
            } 
        }
        return;
    }
    
    private static void customerPage() {
        clearConsole();
        System.out.println("1. Add Menu");
        System.out.println("2. Remove Menu");
        System.out.println("3. Add Voucher");
        System.out.println("4. Remove Voucher");
        System.out.println("5. Log Out");
        int input = sc.nextInt();
    }

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {}
    }
}
