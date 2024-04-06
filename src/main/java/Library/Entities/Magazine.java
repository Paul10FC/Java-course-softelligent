package Library.Entities;

import Library.Genres;
import Library.Library;
import Library.LibraryItem;
import Library.Loanable;
import Library.TypeOfItem;
import lombok.Getter;

@Getter
public class Magazine extends LibraryItem implements Loanable {

    public Magazine(int id, String title, boolean availability, Genres genres, String releaseDate) {
        super(id, title, availability, genres, releaseDate, TypeOfItem.MAGAZINE);
    }

    @Override
    public void getInfoItem() {
        System.out.println(this);
    }

    @Override
    public void loanItem() {
        this.setAvailability(false);
        Library.loanedMagazine.add(this);
        System.out.println("Magazine " + this.getTitle() + " has been loaned");
        System.out.println("ID: " + this.getId());
    }

    @Override
    public void returnItem() {
        this.setAvailability(true);
        Library.loanedMagazine.remove(this);
        System.out.println("The magazine " + this.getTitle() + " has been returned");
        System.out.println("ID: " + this.getId());
    }

    @Override
    public String toString() {
        return "------------------------" +
                " \ntype: " + type +
                " \nid: " + id +
                " \ntitle: " + title +
                " \navailability: " + availability +
                " \ngenre: " + genres +
                " \nreleaseDate: " + releaseDate +
                "\n------------------------";
    }
}
