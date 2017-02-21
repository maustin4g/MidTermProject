/**
 * Created by ernestine on 2/20/2017.
 */
public class Book {
    private String author;
    private String title;
    private String format;
    private String genre;
    private String status;

    public Book () {
        author = "";
        title = "";
        format ="";
        genre = "";
        status = "";

    }
    //"all-arguments" constructor
    public Book(String author, String title, String format, String genre, String status){

this.author = author;
this.title = title;
this.format = format;
this.genre = genre;
this.status = status;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", format='" + format + '\'' +
                ", genre='" + genre + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
