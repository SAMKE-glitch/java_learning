package com.samke.of;

// Handles bussines logic
// Acts as a service layer  to manage business logic separately
// Handles status updates clearly (so Order.java focuses on data)
public class OrderService {
    public void processOrder(Order order, OrderStatus newStatus) {
        order.updateStatus(newStatus);
    }
}