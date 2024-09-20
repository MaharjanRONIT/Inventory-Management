public class Product {
    private String name;
    private double price;
    private double quantity;
    private double totalQuantitySold;

    public Product(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.totalQuantitySold = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getTotalQuantitySold() {
        return totalQuantitySold;
    }

    public void addTotalQuantitySold(double quantitySold) {
        this.totalQuantitySold += quantitySold;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: $" + price + ", Quantity: " + quantity;
    }
}