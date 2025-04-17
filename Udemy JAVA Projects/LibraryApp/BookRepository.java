import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        // Book book1 = new Book("83471", "The dead of the Night", "Horror", null, "S. K. Eleton");
        // Books.add(book1);
        books.add(new Book("83471", "The dead of the Night", "Horror", null, "S. K. Eleton", 4, 2));
        books.add(new Book("83472", "Java for Dummies", "Programming", null, "John", 5, 2));
        books.add(new Book("83473", "Castles and Crenellations", "Historical", null, "H. P. Anderson", 6, 4));
        books.add(new Book("83474", "Ceva for ceve", "Fantasy", null, "F. E. Anvil", 7, 3));
        books.add(new Book("83475", "Time of Night", "Romance", null, "A. U. Ring", 6, 3));
        books.add(new Book("83476", "Castle Siege", "Historical", null, "N. N. Blacksmith", 3, 1));
        books.add(new Book("83477", "Night and Day", "Mistery", null, "Q. Z. Bizar", 6, 1));
        books.add(new Book("83474", "Never Time", "Thrler", null, "P. B. Jelliton", 7, 5));

    }
    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }
    public ArrayList<Book> findByTitle(String keyword) {
        ArrayList<Book> booksFound = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }

}
