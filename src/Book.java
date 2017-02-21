/**
 * Created by Millicent, Nicole, and Teron on 2/20/2017.
 */
public class Book {

    private String author;
    private String title;
    private String format;
    private String genre;
    private String status;

    //No argument constructor
    public Book () {
        author = "";
        title = "";
        format ="";
        genre = "";
        status = "";
    }

    //All-arguments constructor
    public Book(String author, String title, String format, String genre, String status){
        this.author = author;
        this.title = title;
        this.format = format;
        this.genre = genre;
        this.status = status;
    }

    //I make a design decision that I need a constructor that takes
    //every argument except completion (because true/false)
    public Book (String author, String title, String format, String genre) {
        this.author = author;
        this.title = title;
        this.format = format;
        this.genre = genre;
        this.status = "CheckedOut"; //giving a default
    }

    //Generating the 'getter'

    public String getAuthor() {
        return author;
    }


    public String getTitle() {
        return title;
    }

    public String getFormat() {
        return format;
    }

    public String getGenre() {
        return genre;
    }

    //Generating the 'setter'

    public void setAuthor(String author) {
        this.author = author;
    }

    //other methods
    public boolean checkStatus(String status) {
        if (status.equals(this.status)) {
            return true;
        }
        return false;

    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setFormat(String format) {
        this.format = format;

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
