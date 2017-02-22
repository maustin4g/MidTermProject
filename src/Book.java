/**
 * Created by Millicent, Nicole, and Teron on 2/20/2017.
 */
public class Book {
    private String author;
    private String title;
    private String format;
    private String genre;
    private String status;

    //All-arguments constructor
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




    //Generating the 'setter'


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

    public void checkOut(){
        this.status = "Checked Out";
    }
    public void checkIn() {
        this.status = "Checked In";
    }

    public boolean checkStatus(String status) {
        if (status.equals(this.status)) {
            return true;
        }
        return false;

    }
    @Override
    public String toString() {
        return title + "\t    "+ author + "  \t" +
                format + "  \t" +
                genre + "  \t" +
                status;
    }
}
