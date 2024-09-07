import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Library {
    private List<Shelf> shelves;
    private List<Reader> readers;

    public Library() {
        shelves = new ArrayList<>();
        readers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            shelves.add(new Shelf());
        }
        AddBookToAllShelves(new Book("Author1", "Title1", 100));
        AddBookToAllShelves(new Book("Author1", "Title1", 200));
    }
    private void AddBookToAllShelves(Book book) {
        for (Shelf shelf : shelves) {
            shelf.addbook(book);
        }
    }
    public boolean IsTherePlaceForNewBook() {
        for (Shelf shelf : shelves) {
            if (!shelf.IsShelfFull) {
                return true;
            }
        }
        return false;
    }
    public void AddNewBook(Book book) {
        for (Shelf shelf : shelves) {
            if (!shelf.IsShelfFull) {
                shelf.addbook(book);
                return;
            }
        }
        System.out.println("No space left in any shelf");
    }
    public void DeleteBook(String title) {
        for (Shelf shelf : shelves) {
            Iterator<Book> iterator = shelf.books.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getTitle().equals(title)) {
                    iterator.remove();
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }
    public void RegisterReader(int id, String name) {
        readers.add(new Reader(id, name));
    }
    public void RemoveReader(String name) {
        readers.removeIf(reader -> reader.name.equals(name));
    }
    public List<String> SearchByAuthor(String author) {
        List<String> titles = new ArrayList<>();
        for (Shelf shelf : shelves) {
            for (Book book : shelf.books) {
                if (book.getAuthor().equals(author)) {
                    titles.add(book.getTitle());
                }
            }
        }
        return titles;
    }
}