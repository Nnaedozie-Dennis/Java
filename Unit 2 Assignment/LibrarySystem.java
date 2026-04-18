import java.util.HashMap;
import java.util.Scanner;

public class LibrarySystem {

    // HashMap to store books: title -> quantity
    static HashMap<String, Integer> library = new HashMap<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("=== Welcome to Simple Library System ===");

        do {
            // Display menu
            System.out.println("\n1. Add Books");
            System.out.println("2. Borrow Books");
            System.out.println("3. Return Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    addBook(input);
                    break;

                case 2:
                    borrowBook(input);
                    break;

                case 3:
                    returnBook(input);
                    break;

                case 4:
                    System.out.println("Exiting system... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 to 4.");
            }

        } while (choice != 4);

        input.close();
    }

    // ADD BOOKS
    public static void addBook(Scanner input) {

        System.out.print("Enter book title: ");
        String title = input.nextLine().toLowerCase();

        System.out.print("Enter author name: ");
        String author = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        input.nextLine();

        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return;
        }

        if (library.containsKey(title)) {
            library.put(title, library.get(title) + quantity);
            System.out.println("Book already exists. Quantity updated.");
        } else {
            library.put(title, quantity);
            System.out.println("New book added successfully.");
        }
    }

    // BORROW BOOKS
    public static void borrowBook(Scanner input) {

        System.out.print("Enter book title: ");
        String title = input.nextLine().toLowerCase();

        System.out.print("Enter quantity to borrow: ");
        int quantity = input.nextInt();
        input.nextLine();

        if (!library.containsKey(title)) {
            System.out.println("Error: Book not found in library.");
            return;
        }

        int available = library.get(title);

        if (quantity <= 0) {
            System.out.println("Invalid borrow quantity.");
        } else if (quantity > available) {
            System.out.println("Not enough books available.");
        } else {
            library.put(title, available - quantity);
            System.out.println("Books borrowed successfully.");
        }
    }

    // RETURN BOOKS
    public static void returnBook(Scanner input) {

        System.out.print("Enter book title: ");
        String title = input.nextLine().toLowerCase();

        System.out.print("Enter quantity to return: ");
        int quantity = input.nextInt();
        input.nextLine();

        if (quantity <= 0) {
            System.out.println("Invalid return quantity.");
            return;
        }

        if (!library.containsKey(title)) {
            System.out.println("Error: This book does not belong to the library system.");
        } else {
            library.put(title, library.get(title) + quantity);
            System.out.println("Book returned successfully.");
        }
    }
}