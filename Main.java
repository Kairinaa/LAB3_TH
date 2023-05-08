import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Product p1 = new Product("sp4", "Nuoc tuong", 8000);
        Product p2 = new Product("sp1", "Gao", 18000);
        Product p3 = new Product("sp3", "Duong", 10000);
        Product p4 = new Product("sp1", "Gao", 18000);
        Order o1 = new Order(1, LocalDate.now());
        o1.addLineItem(p1, 10);
        o1.addLineItem(p2, 5);
        o1.addLineItem(p3, 1);
        o1.addLineItem(p4, 1);
        System.out.println(o1.toString());
    }
}
