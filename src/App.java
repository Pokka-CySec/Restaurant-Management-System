import Menu.*;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("================");
            System.out.println("1. Customer");
            System.out.println("2. Admin");
            System.out.println("3. Exit");
            System.out.println("================");
            int user_option = sc.nextInt();

            if (user_option == 1) {
                customerAuth();
            }
            else if (user_option == 2) {
                adminAuth();
            }
            
            else if (user_option == 3) {
                break;
            }
            else {
                System.out.println("Invalid Input. try again");
                Thread.sleep(2000);
                clearConsole();
            }
        }
        Menu mainMenu = new Menu("Main Menu");

        Category signature = new Category("Signature");
        Category dessert = new Category("Dessert");

        dessert.addFood(new Food(001, "Chocolate Cake", 5.99));
        dessert.addFood(new Food(002, "Ice Cream", 6.00));

        signature.addFood(new Food(001, "Chef's Special Pasta", 8.00));
        signature.addFood(new Food(002, "Grilled Salmon", 9.00));

        mainMenu.addCategory(dessert);
        mainMenu.addCategory(signature);

        mainMenu.display();


    }

    private static void adminAuth() {
    }

    private static void clearConsole() {
    try {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        else {
            System.out.print("\033\143");
        }
    } catch (IOException | InterruptedException ex) {}
}

    private static void customerAuth() {
    }
    
}

// malah dh nk sambung, letih