package com.company.of;

// The Order class stores order details and allows updating order status
public class Order {
    private String orderId;
    private OrderStatus status;

    // Constructor initializes a new order with default status status as DRAFT
    public Order(String orderId) {
        this.orderId = orderId;
        this.status = OrderStatus.DRAFT;
    }

    // Updates order status while ensuring valid transitions
    public void updateSatus(OrderStatus newStatus) {
        if (isValidTransion(newStatus)) {
            this.status = newStatus;
            System.out.println("Order" + orderId + " status update to: " + status);
        } else {
            System.out.println("Invalid status transition from " + status + " to " + newStatus);
        }
    }
    // Ensures that status transitions follow the correct order && represents order and it's status
    // Enforces valid state transitions (prevents skipping steps like DRAFT -> DISPATCHED)
    private boolean isValidTransition(OrderStatus newStatus){
        return switch (this.status) {
            case DRAFT -> mewStatus == OrderStatus.PUBLISHED;
            case PUBLISHED -> newStatus == OrderStatus.PROCESSING;
            case PROCESSING -> newStatus == OrderStatus.DISPATCHED;
            case DELIVERED -> newStatus == OrderStatus == OrderStatus.DELIVERED;
            case COMPLETED -> false; // No transition after completion
        };
    }

    // Getter for status
    public OrderStatus getStatus() {
        return status;
    }
}