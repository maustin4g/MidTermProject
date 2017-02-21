import java.util.ArrayList;

/**
 * Created by teronb1005 on 2/21/2017.
 */
public class Library {
    public static void main(String[] args) {
        Library lib = new Library ();
        ArrayList<Book> catalogue = new ArrayList<Book>();


        Book book = lib.getBookAuthor("Clement C. Moore", catalogue);
        System.out.println(book);

        book = lib.getBookTitle("the tempest", catalogue);
        System.out.println(book);



    }
    public Book getBookTitle (String title, ArrayList<Book> catalogue) {
        for (Book b: catalogue) {
            if (title.equalsIgnoreCase(b.getTitle())) {
                return b;
            }
        }
        return null;
    }


    public Book getBookAuthor(String author, ArrayList<Book> catalogue) {
        for (Book b: catalogue) {
            if (author.equalsIgnoreCase(b.getAuthor())) {
               return b;
            }
        }
        return null;
    }
}
