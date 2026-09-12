class Order {
    // Static field shared by all instances, initialized to 0
    static int totalOrders = 0;

    // Constructor increments the shared counter every time an object is made
    public Order() {
        totalOrders++;
    }
}

public class order {
    public static void main(String[] args) {
        // Create four Order objects
        Order o1 = new Order();
        Order o2 = new Order();
        Order o3 = new Order();
        Order o4 = new Order();
        
        // Print totalOrders exactly once using the class name
        System.out.println("Total Orders created: " + Order.totalOrders);
    }
}
