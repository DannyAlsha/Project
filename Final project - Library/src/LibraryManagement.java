import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("For adding a book - press 1");
            System.out.println("For deleting a book - press 2");
            System.out.println("For registering a new reader - press 3");
            System.out.println("For removing a reader - press 4");
            System.out.println("For searching books by author - press 5");
            System.out.println("For exit - press 6");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter book author");
                    String bookAuthor = scanner.nextLine();
                    System.out.println("Enter book title");
                    String bookTitle = scanner.nextLine();
                    System.out.println("Enter number of pages:");
                    int numPages = scanner.nextInt();
                    library.AddNewBook(new Book(bookAuthor, bookTitle, numPages));
                    break;

                case 2:
                    System.out.println("Enter book title to delete:");
                    String DeleteTitle = scanner.nextLine();
                    library.DeleteBook(DeleteTitle);
                    break;

                case 3:
                    System.out.println("Enter reader ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter reader name:");
                    String readerName = scanner.nextLine();
                    library.RegisterReader(id, readerName);
                    break;

                case 4:
                    System.out.println("Enter reader name to remove:");
                    String removeReaderName = scanner.nextLine();
                    library.RemoveReader(removeReaderName);
                    break;

                case 5:
                    System.out.println("Enter author name:");
                    String searchAuthor = scanner.nextLine();
                    System.out.println("Books by " + searchAuthor + ":");
                    for (String title : library.SearchByAuthor(searchAuthor)) {
                        System.out.println(title);
                    }
                    break;

                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please enter a number between 1-6.");
                    break;
            }
        }
    }
}