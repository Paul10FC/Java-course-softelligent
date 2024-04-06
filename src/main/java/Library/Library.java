package Library;

import Library.Entities.Book;
import Library.Entities.Magazine;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static List<LibraryItem> libraryItemList = new ArrayList<>();
    public  static List<Book> loanedBook = new ArrayList<>();
    public static List<Magazine> loanedMagazine = new ArrayList<>();
}
