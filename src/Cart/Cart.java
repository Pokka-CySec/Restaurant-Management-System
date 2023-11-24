package Cart;

import User.Customer;
import java.util.LinkedList;
import java.util.Queue;

public class Cart {
    private Customer user;
    private Queue<Order> orders;

    public Cart(Customer user) {
        this.user = user;
        this.orders = new LinkedList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Queue<Order> getOrders() {
        return orders;
    }

    public double getTotalCartPrice() {
        double total = 0.0;
        for (int i = 0; i < orders.size(); i++) {
            // Order order = orders.element();
        }
        return total;
    }

    public Customer getUser() {
        return user;
    }
}
