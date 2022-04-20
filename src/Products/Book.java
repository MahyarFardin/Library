package Products;

import java.util.ArrayList;
import java.util.Date;

import Assets.ELangeANDNationality;
import Contributors.People.Author;
import Products.Enumerators.EGanre;

public class Book implements IBook {
    protected String title;
    protected String publisher;
    protected EGanre ganre;
    protected ArrayList<Author> authors;
    protected int page;
    protected Date publishedDate;
    protected int code;
    protected int id;
    protected ELangeANDNationality lang;
    protected static int idGenerator;

    public Book() {
        this.title = "";
        this.publisher = "";
        this.ganre = EGanre.UD;
        this.authors = new ArrayList<Author>();
        this.publishedDate=null;
        this.page = 0;
        this.code = 0;
        this.id = 0;
        this.lang = ELangeANDNationality.UD;

        idGenerator++;
        this.id = idGenerator;
    }

    public Book(String title,
            String publisher,
            EGanre ganre,
            ArrayList<Author> authors,
            int page,
            Calendar publishedDate,
            int code,
            ELangeANDNationality lang) {

        this.title = title;
        this.publisher = publisher;
        this.ganre = ganre;
        this.authors = authors;
        this.publishedDate = publishedDate;
        this.page = page;
        this.code = code;
        this.id = 0;
        this.lang = ELangeANDNationality.UD;
        idGenerator++;
        this.id = idGenerator;
    }

    public Book (Book book){
        this(book.title, book.publisher, book.ganre, new ArrayList<>(book.authors), book.page, book.publishedDate, book.code, book.lang);
    }
}