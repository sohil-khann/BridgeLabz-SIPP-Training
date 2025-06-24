package JavaConstructor;

public class Product {
    // Instance Variables
    String productName;
    double price;

    // Class Variable
    static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts each time a new Product object is created
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.00);
        product1.displayProductDetails();
        Product.displayTotalProducts();

        System.out.println();

        Product product2 = new Product("Mouse", 25.00);
        product2.displayProductDetails();
        Product.displayTotalProducts();

        System.out.println();

        Product product3 = new Product("Keyboard", 75.00);
        product3.displayProductDetails();
        Product.displayTotalProducts();
    }
}