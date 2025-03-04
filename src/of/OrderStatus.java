package com.company.of;
// Enum defining all possible order states in the fulfillment process
// enum for order states
public enum OrderStatus {
    DRAFT, // Initial state when an order is created
    PUBLISHED, // Order is made public for processing
    PROCESSING, // Order is being prepared
    DISPATCHING, // Order is being put on the cage plus on the vehicle
    DISPATCHED, //Order is sent out for delivery
    DELIVERED, //Order has reached the customer
    COMPLETED; // Final state after successful delivery && payment (pay balance button clicked)
}