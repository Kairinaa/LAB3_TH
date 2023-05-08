import java.time.LocalDate;

class Product {
    private String description;
    private String productID;
    private double price;
    public Product() {}
    public Product(String id, String desc, double price) {
        this.productID = id;
        this.description = desc;
        this.price = price;
    }
    public double calcTotalPrice(int quantity) {
        return this.price * quantity;
    }
    public String toString() {
        return String.format("[%s] %s: $%.2f", productID, description, price);
    }
    public String getDescription() {
        return description;
    }
    public String getProductID() {
        return productID;
    }
    public double getPrice() {
        return price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setProductID(String productID) {
        this.productID = productID;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}