package Products.Digital;

import java.util.ArrayList;
import java.util.Date;

import Assets.ELangeANDNationality;
import Contributors.People.Author;
import Products.Book;
import Products.Enumerators.EFileType;
import Products.Enumerators.EGanre;
import Transactions.IBarrowable;

public class DigitalBook extends Book implements IDigital, IBarrowable {
    private int size;
    private Date dateCreated;
    private EFileType fileType;

    public DigitalBook() {
        super();
        size = 0;
        dateCreated=null;
        fileType = EFileType.UD;
    }

    public DigitalBook(String title,
            String publisher,
            EGanre ganre,
            ArrayList<Author> authors,
            int page,
            Date publishedDate,
            int code,
            ELangeANDNationality lang,
            int size,
            Date dateCreated,
            EFileType fileType) {

        super(title, publisher, ganre, authors, page, publishedDate, code, lang);
        this.size = size;
        this.dateCreated = dateCreated;
        this.fileType = fileType;
    }

    public DigitalBook(DigitalBook digitalBook){
        super(digitalBook);
        this.size = digitalBook.size;
        this.dateCreated = digitalBook.dateCreated;
        this.fileType = digitalBook.fileType;
    }


}
