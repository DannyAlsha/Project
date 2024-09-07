public class Book {
    private String Author;
    private String Title;
    private int NumOfPages;

    public Book(String Author, String Title, int NumOfPages){
        this.Author = Author;
        this.Title = Title;
        this.NumOfPages = NumOfPages;
    }
    public String getAuthor() {
        return Author;
    }
    public String getTitle() {
        return Title;
    }
    public int getNumOfPages() {
        return NumOfPages;
    }


    public String toString() {
        return Title + "by" + Author + "(" + NumOfPages + " pages)";
    }
}