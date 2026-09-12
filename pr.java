class Product {
    String productId;
    String productName;

    // Constructor taking both values as parameters
    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}

public class pr {
    public static void main(String[] args) {
        // Create one Product object through the constructor
        Product prod = new Product("P-1042", "Wireless Mouse");
        
        // Print its fields on one line
        System.out.println(prod.productId + " - " + prod.productName);
    }
}
