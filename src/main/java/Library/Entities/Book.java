package Library.Entities;

import Library.Genres;
import Library.Library;
import Library.LibraryItem;
import Library.Loanable;
import Library.TypeOfItem;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Book extends LibraryItem  implements Loanable {
    private final String auth;

    public Book(int id, String title, boolean availability, Genres genres, String releaseDate, String auth) {
        super(id, title, availability, genres, releaseDate, TypeOfItem.BOOK);
        this.auth = auth;
    }

    @Override
    public void getInfoItem() {
        System.out.println(this);
    }

    @Override
    public void loanItem() {
        this.setAvailability(false);
        Library.loanedBook.add(this);
        System.out.println("Book " + this.getTitle() + "has been loaned");
    }

    @Override
    public void returnItem() {
        this.setAvailability(true);
        Library.loanedBook.remove(this);
        System.out.println("The book " + this.getTitle() + " has been returned");
    }

    @Override
    public String toString() {
        return "------------------------" +
                " \ntype: " + type +
                " \nid: " + id +
                " \nauth: " + auth +
                " \ntitle: " + title +
                " \navailability: " + availability +
                " \ngenre: " + genres +
                " \nreleaseDate: " + releaseDate +
                "\n------------------------";
    }
}
