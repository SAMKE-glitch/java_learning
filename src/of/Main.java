package com.samke.of;

// Min class simulating an order's journey through different statuses
public class Main {
    public static void main(String[] args) {
        Order order = new Order("12345");
        OrderService service = new OrderService();

        service.processOrder(order, com.samke.of.OrderStatus.PUBLISHED); // VALID
        service.processOrder(order, com.samke.of.OrderStatus.PROCESSING); // VALID
        service.processOrder(order, com.samke.of.OrderStatus.DISPATCHING); // VALID
        service.processOrder(order, com.samke.of.OrderStatus.DISPATCHED); // VALID
        service.processOrder(order, com.samke.of.OrderStatus.DELIVERED); // VALID
        service.processOrder(order, com.samke.of.OrderStatus.COMPLETED); // VALID
        service.processOrder(order, com.samke.of.OrderStatus.DRAFT); // INVALID
    }
}