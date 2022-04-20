package Products.Physical;

import java.util.ArrayList;
import java.util.Calendar;

import Assets.ELangeANDNationality;
import Contributors.People.Author;
import Products.Book;
import Products.Enumerators.EFileType;
import Products.Enumerators.EGanre;
import Transactions.IBarrowable;

public class PhysicalBook extends Book implements IPhysical, IBarrowable {
    private int sizeType;
    private int healthState;

    public PhysicalBook() {
        super();
        sizeType = 0;
        healthState = 0;
    }

    public PhysicalBook(String title,
            String publisher,
            EGanre ganre,
            ArrayList<Author> authors,
            int page,
            Calendar publishedDate,
            int code,
            ELangeANDNationality lang,
            int size,
            Calendar dateCreated,
            EFileType fileType,
            int sizeType,
            int healthState) {

        super(title, publisher, ganre, authors, page, publishedDate, code, lang);
        this.sizeType = sizeType;
        this.healthState = healthState;
    }
}
