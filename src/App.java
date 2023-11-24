import Menu.*;
public class App {

    public static void main(String[] args) {
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
    
}