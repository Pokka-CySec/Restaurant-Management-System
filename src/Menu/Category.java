package Menu;

import java.util.ArrayList;
import java.util.List;

public class Category extends MenuComponent {
    private List<MenuComponent> foods = new ArrayList<>();
    private String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public void addFood(MenuComponent food) {
        foods.add(food);
    }

    @Override
    public void display() {
        System.out.println("  " + categoryName);
        for (MenuComponent food : foods) {
            food.display();
        }
        System.out.println();
    }
}
