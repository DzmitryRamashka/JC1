package home_work5;

public class Main {

    public static void main(String[] args) {

        PaperBook firstPaperBook = new PaperBook("Three men in the boat","J.K. Jerom");
        PaperNewsPaper firstPaperNewsPaper = new PaperNewsPaper("The Sun");
        PaperMagazine firstPaperMagazine = new PaperMagazine("People","Steve Wozniak");

        System.out.println(firstPaperBook.about() + " " + firstPaperBook.getTitle());
        System.out.println(firstPaperNewsPaper.about() + " " + firstPaperNewsPaper.getTitle());
        System.out.println(firstPaperMagazine.about() + " " + firstPaperMagazine.getTitle());

    }
}
