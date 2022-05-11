package Products.Physical;

import java.util.ArrayList;
import java.util.Date;

import Contributors.People.Author;
import Products.Book;
import Tag.ITagList;
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
            ITagList ganre,
            ArrayList<Author> authors,
            int page,
            Date publishedDate,
            int code,
            ITagList lang,
            int size,
            Date dateCreated,
            ITagList fileType,
            int sizeType,
            int healthState) {

        super(title, publisher, ganre, authors, page, publishedDate, code, lang, numberOfCopies);
        this.sizeType = sizeType;
        this.healthState = healthState;
    }

    public PhysicalBook(PhysicalBook physicalBook){
        super(physicalBook);
        this.sizeType = physicalBook.sizeType;
        this.healthState = physicalBook.healthState;
    }

    public void setSizeType(int sizeType) {
        this.sizeType = sizeType;
    }
    public int getSizeType() {
        return sizeType;
    }
    public void setHealthState(int healthState) {
        this.healthState = healthState;
    }
    public int getHealthState() {
        return healthState;
    }
}
