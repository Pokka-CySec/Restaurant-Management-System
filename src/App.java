import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);
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
                adminPage();
                break;
            }
            else {
                System.out.println("\nInvalid ID! please try again");
            }
        }
        return;
        
    }

    private static void adminPage() {
        while (true) {
           clearConsole();
            System.out.println("1. Add Menu");
            System.out.println("2. Remove Menu");
            System.out.println("3. Add Voucher");
            System.out.println("4. Remove Voucher");
            System.out.println("5. Log Out");
            int input = sc.nextInt();

            if (input == 1) {
            }
            else if (input == 2) {
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
