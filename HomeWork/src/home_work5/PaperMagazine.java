package home_work5;

public class PaperMagazine extends Magazine {
    private String title;
    private String cover;

    public PaperMagazine(String title,String cover) {
        this.title = title;
        this.cover = cover;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String about() {
        return "This is a paper magazine";
    }



}
