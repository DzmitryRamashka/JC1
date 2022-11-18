package home_work5;

public class PaperBook extends Book {
    private String title;
    private String author;


    public PaperBook(String title,String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

   @Override
    public String about() {
        return "This is a paper book";
    }







}
