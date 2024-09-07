import java.util.ArrayList;
import java.util.List;

public class Shelf {
    List<Book> books;
    protected boolean IsShelfFull;

    public Shelf() {
        books = new ArrayList<>(5);
        IsShelfFull = false;
    }
    public void addbook(Book book) {
        if (books.size() < 5) {
            books.add(book);
            IsShelfFull = books.size() == 5;
        }
        else {
            System.out.println("The shelf is full.");
        }
    }
    public void replaceBooks(int pos1, int pos2) {
        if (pos1 < 1 || pos1 > 5 || pos2 < 1 || pos2 > 5) {
            System.out.println("Invalid positions. Please use number between 1-5.");
            return;
        }
        Book temp = books.get(pos1 - 1);
        books.set(pos1 - 1, books.get(pos2 - 1));
        books.set(pos2 - 1, temp);
    }
}