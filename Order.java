import java.time.LocalDate;

class Order {
    private int orderID;
    private LocalDate orderDate;
    private OrderDetail[] lineItems;
    private int count;
    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = new OrderDetail[20];
        this.count = 0;
    }
    public int getOrderID() {
        return orderID;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public OrderDetail[] getLineItems() {
        return lineItems;
    }
    public void addLineItem(Product p, int quantity) {
        lineItems[count++] = new OrderDetail(p, quantity);
    }
    public double calcTotalCharge() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += lineItems[i].calcTotalPrice();
        }
        return total;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ").append(orderID).append(" (").append(orderDate).append("):\n");
        for (int i = 0; i < count; i++) {
            sb.append("\t").append(lineItems[i]).append("\n");
        }
        sb.append("Total charge: ").append(calcTotalCharge());
        return sb.toString();
    }
}
