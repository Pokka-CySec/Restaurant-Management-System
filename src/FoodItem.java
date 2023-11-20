public class FoodItem {
    private int foodID;
    private String foodName;
    private double price;

    public FoodItem(int foodID, String foodName, double price) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.price = price;
    }

    public int getFoodID() {
        return foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getPrice() {
        return price;
    }
}
