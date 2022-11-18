package home_work5;

public class PaperNewsPaper extends Newspaper {

    private String title;

    public PaperNewsPaper(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String about() {
        return "This a paper newspaper";
    }




}
