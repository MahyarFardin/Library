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
        this.publishedDate = null;
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
            Date publishedDate,
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

    public Book(Book book) {
        this(book.title, book.publisher, book.ganre, new ArrayList<>(book.authors), book.page, book.publishedDate,
                book.code, book.lang);
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setGanre(EGanre ganre) {
        this.ganre = ganre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setIdGenerator(int idGenerator) {
        Book.idGenerator = idGenerator;
    }

    public void setLang(ELangeANDNationality lang) {
        this.lang = lang;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public int getCode() {
        return code;
    }

    public EGanre getGanre() {
        return ganre;
    }

    public int getId() {
        return id;
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public ELangeANDNationality getLang() {
        return lang;
    }

    public int getPage() {
        return page;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }
}