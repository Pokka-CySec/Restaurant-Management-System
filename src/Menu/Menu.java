package Menu;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private List<MenuComponent> categories = new ArrayList<>();
    private String menuName;

    public Menu(String menuName) {
        this.menuName = menuName;
    }

    public void addCategory(MenuComponent category) {
        categories.add(category);
    }

    @Override
    public void display() {
        System.out.println(menuName + "\n");
        for (MenuComponent category : categories) {
            category.display();
        }
    }
}
