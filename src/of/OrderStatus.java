package com.company.of;
// Enum defining all possible order states in the fulfillment process
public enum OrderStatus {
    DRAFT, // Initial state when an order is created
    PUBLISHED, // Order is made public for processing
    PROCESSING, // Order is being prepared
    DISPATCHED, //Order is sent out for delivery
    DELIVERED, //Order has reached the customer
    COMPLETED; // Final state after successful delivery
}