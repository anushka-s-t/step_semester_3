class LibraryCard {
    String holderName;
    int booksIssued;
    boolean active;
}

public class lib {
    public static void main(String[] args) {
        LibraryCard card = new LibraryCard();

        // Printing fields immediately to observe Java default values
        System.out.println("Holder: " + card.holderName);
        System.out.println("Books Issued: " + card.booksIssued);
        System.out.println("Active: " + card.active);
    }
}
