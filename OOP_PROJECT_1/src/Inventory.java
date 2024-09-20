import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayInventory() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void sellProduct(String name, int quantitySold) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                double currentQuantity = p.getQuantity();
                if (currentQuantity >= quantitySold) {
                    p.setQuantity(currentQuantity - quantitySold);
                    double revenue = quantitySold * p.getPrice();
                    p.addTotalQuantitySold(quantitySold);
                    System.out.println("Sold " + quantitySold + " " + p.getName() + " for $" + revenue);
                } else {
                    System.out.println("Insufficient quantity for " + p.getName());
                    return; // exit the method if quantity is insufficient
                }
                return; // exit the method if product is found and quantity is updated
            }
        }
        System.out.println("Product not found");
    }

    public void generateRevenueReport() {
        double totalRevenue = 0;
        for (Product p : products) {
            double sold = p.getTotalQuantitySold();
            double revenue = sold * p.getPrice();
            System.out.println(p.getName() + " - " + sold + " sold - $" + revenue + " in revenue");
            totalRevenue += revenue;
        }
        System.out.println("Total revenue: $" + totalRevenue);
    }

    public void searchProduct(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println(p);
                return;
            }
        }
        System.out.println("Product not found");
    }
}