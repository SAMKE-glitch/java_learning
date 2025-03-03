public class Main {
    public static  void main(String[] args) {
        Order order = new Order(1L, "John Doe");
        OrderService orderService = new OrderService();

        System.out.println("Before update: " + order);

        orderService.updateOrderStatus(order, Status.IN_PROGRESS);
        orderService.updateOrderStatus(order, Status.COMPLETED);
    }
}