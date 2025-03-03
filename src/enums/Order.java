public class Order {
    private Long id;
    private String customerName;
    private Status status; //Using the enum here

    public Order(long id, String customerName) {
       this.id = id;
       this.customerName = customerName;
       this.status = Status.NEW; // Default status
    }
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Order{id=" + id + ", customerName='" + customerName + "', status=" + status + "}";
    }
}