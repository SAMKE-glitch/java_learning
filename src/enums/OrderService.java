package enums;

import com.samke.of.Order;

public class OrderService {
    public void updateOrderStatus(Order order, Status status) {
        order.setStatus(status);
        System.out.println("Order updated: " + order);
    }
}