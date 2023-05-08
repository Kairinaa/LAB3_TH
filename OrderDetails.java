import java.time.LocalDate;
class OrderDetail {
    private Product product;
    private int quantity;
    public OrderDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public double calcTotalPrice() {
        return product.calcTotalPrice(quantity);
    }
    public String toString() {
        return String.format("%s x %d = $%.2f", product, quantity, calcTotalPrice());
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

