package Products.Digital;

import java.util.ArrayList;
import java.util.Date;

import Contributors.People.Author;
import Products.Book;
import Tag.ITagList;
import Transactions.IBarrowable;

public class DigitalBook extends Book implements IDigital, IBarrowable {
    private int size;
    private Date dateCreated;
    private ITagList fileType;

    public DigitalBook() {
        super();
        size = 0;
        dateCreated=null;
        fileType = null;
    }

    public DigitalBook(String title,
            String publisher,
            ITagList ganre,
            ArrayList<Author> authors,
            int page,
            Date publishedDate,
            int code,
            ITagList lang,
            int size,
            Date dateCreated,
            ITagList fileType) {

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

    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public void setFileType(ITagList fileType) {
        this.fileType = fileType;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public ITagList getFileType() {
        return fileType;
    }
    public int getSize() {
        return size;
    }
}
