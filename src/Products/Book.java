package Products;

import java.util.ArrayList;
import java.util.Calendar;

import Assets.ELangeANDNationality;
import Products.Enumerators.EGanre;
import Contributors.Author;

public class Book implements IBook {
    protected String title;
    protected String publisher;
    protected EGanre ganre;
    protected ArrayList<Author> authors;
    protected int page;
    protected Calendar publishedDate;
    protected int code;
    protected int id;
    protected ELangeANDNationality lang;
    protected static int idGenerator;

    public Book() {
        this.title = "";
        this.publisher = "";
        this.ganre = EGanre.UD;
        this.authors = new ArrayList<Author>();
        this.publishedDate.set(0, 0, 0);
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

}