package Library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class LibraryItem {
    protected int id;
    protected String title;
    protected boolean availability;
    protected Genres genres;
    protected String releaseDate;
    protected TypeOfItem type;
    public abstract void getInfoItem();
}
