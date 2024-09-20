import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        boolean running = true;
        while (running) {
            System.out.println("1. Add product");
            System.out.println("2. Display inventory");
            System.out.println("3. Sell product");
            System.out.println("4. Search product");
            System.out.println("5. Generate revenue report");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter product name: ");
                    String name = scanner.next();
                    System.out.println("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.println("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.addProduct(new Product(name, price, quantity));
                    break;
                case 2:
                    inventory.displayInventory();
                    break;
                case 3:
                    System.out.println("Enter product name: ");
                    String sellName = scanner.next();
                    System.out.println("Enter quantity sold: ");
                    int quantitySold = scanner.nextInt();
                    inventory.sellProduct(sellName, quantitySold);
                    break;
                case 4:
                    System.out.println("Enter product name: ");
                    String searchName = scanner.next();
                    inventory.searchProduct(searchName);
                    break;
                case 5:
                    inventory.generateRevenueReport();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose an option from 1 to 6.");
            }
        }

        scanner.close();
    }
}
