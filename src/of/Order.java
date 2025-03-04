package com.samke.of;

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
    public void updateStatus(OrderStatus newStatus) {
        if (isValidTransition(newStatus)) {
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
            case DRAFT -> newStatus == OrderStatus.PUBLISHED;
            case PUBLISHED -> newStatus == OrderStatus.PROCESSING;
            case PROCESSING -> newStatus == OrderStatus.DISPATCHING;
            case DISPATCHING -> newStatus == OrderStatus.DISPATCHED;
            case DISPATCHED -> newStatus == OrderStatus.DELIVERED;
            case DELIVERED -> newStatus == OrderStatus.COMPLETED;
            case COMPLETED -> false; // No transition after completion
        };
    }

    // Getter for status
    public OrderStatus getStatus() {
        return status;
    }
}