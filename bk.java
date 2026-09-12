class Book {
    String title;
    double price;
}

public class bk {
    public static void main(String[] args) {
        // Create one Book object
        Book book = new Book();
        
        // Set both fields directly
        book.title = "Clean Code";
        book.price = 650.0;
        
        // Print the result
        System.out.println("Title: " + book.title + " | Price: Rs " + book.price);
    }
}
