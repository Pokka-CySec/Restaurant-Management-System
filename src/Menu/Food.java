package Menu;

import java.text.DecimalFormat;

public class Food extends MenuComponent {
    private int foodID;
    private String foodName;
    private double price;
    private final DecimalFormat dFormat = new DecimalFormat("0.00");

    public Food(int foodID, String foodName, double price) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("    " + foodName + " - RM" + dFormat.format(price));
    }
}