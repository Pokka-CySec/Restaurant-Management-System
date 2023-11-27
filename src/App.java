import java.util.Scanner;
import java.util.LinkedList;

public class App {

    static Scanner sc = new Scanner(System.in);
    static LinkedList<User> users = new LinkedList<>();
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("=============");
            System.out.println("1. Login as Admin");
            System.out.println("2. Login as User");
            System.out.println("3. Exit");
            System.out.println("=============");
            int option = sc.nextInt();

            if (option == 1) {
                adminAuth();
            }
            else if (option == 2) {
                userAuth();
            }
            else if (option == 3) {
                break;
            }
            else {
                System.out.println("Invalid input. Try again");
            }
        }
        sc.close();
    }

    private static void adminAuth() {
        LinkedList<Admin> admins = null;
        FileAdmin adminData = new FileAdmin("data/admin.txt");
        admins = adminData.loadAdmin();

        while (true) {
            System.out.println();
            System.out.println("Enter your ID: ");
            int id = sc.nextInt();

            System.out.println("Enter your password:");
            String password = sc.next();

            Admin admin = null;
            boolean found = false;

            for (int i = 0; i < admins.size(); i++) {
                admin = admins.get(i);
                if (id == admin.getAdminID()) {
                    if (password.equals(admin.getPassword())) {
                        found = true;
                        break;
                    }
                }
            }

            if (found) {
                adminSession(admin);
                break;
            }
            else {
                System.out.println("Invalid credentials , please try again.");
            }
        }

    }

    private static void adminSession(Admin admin) {
        while (true) {
            System.out.println();
            System.out.println("welcome to Admin Page!\n");
            System.out.println("=============");
            System.out.println("1. Add User");
            System.out.println("2. Remove User");
            System.out.println("3. Remove Review");
            System.out.println("4. Add Product");
            System.out.println("5. Remove Product");
            System.out.println("6. Log out");
            System.out.println("=============");
            int option = sc.nextInt();

            if (option == 1) {
                System.out.print("Register username: ");
                String username = sc.next();

                System.out.print("Register User's ID: ");
                int id = sc.nextInt();

                User user = new User(username, id);
                admin.addUser(user, users);

            }

            else if (option == 2) {
                System.out.print("username: ");
                String username = sc.next();

                System.out.print("User's ID: ");
                int id = sc.nextInt();

                User user = new User(username, id);
                admin.removeUser(user, users);
            }

            else if (option == 3) {
                
            }

            else if (option == 4) {
                
            }

            else if (option == 5) {
                
            }
            
            else if (option == 6) {
                for (User user : users) {
                    System.out.println(user.toString());
                }
            }

            else {
                System.out.println("Invalid input. Try again.");
            }
        }
        
    }

    private static void userAuth() {
    }
    
}
