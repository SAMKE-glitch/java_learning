package com.company.of;

// Min class simulating an order's journey through different statuses
public class Main {
    public static void main(String[] args) {
        Order order = new Order("12345");
        OrderService service = new OrderService();

        service.processOrder(order, com.company.of.OrderStatus.PUBLISHED); // VALID
        service.processOrder(order, com.company.of.OrderStatus.PROCESSING); // VALID
        service.processOrder(order, com.company.of.OrderStatus.DISPATCHING); // VALID
        service.processOrder(order, com.company.of.OrderStatus.DISPATCHED); // VALID
        service.processOrder(order, com.company.of.OrderStatus.DELIVERED); // VALID
        service.processOrder(order, com.company.of.OrderStatus.COMPLETED); // VALID
        service.processOrder(order, com.company.of.OrderStatus.DRAFT); // INVALID
    }
}