package Cart;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> orderItems;

    public Order() {
        this.orderItems = new ArrayList<>();
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public double getTotalOrderPrice() {
        double total = 0.0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.getTotalPrice();
        }
        return total;
    }
}
