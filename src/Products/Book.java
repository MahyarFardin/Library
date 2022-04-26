package Products;

import java.util.ArrayList;
import java.util.Date;

import Contributors.People.Author;
import Tag.ITagList;
import Tag.TagList;

public class Book implements IBook {
    protected String title;
    protected String publisher;
    protected ITagList ganre;
    protected ArrayList<Author> authors;
    protected int page;
    protected Date publishedDate;
    protected int code;
    protected int id;
    protected ITagList lang;
    protected static int idGenerator;

    public Book() {
        this.title = "";
        this.publisher = "";
        this.ganre = null;
        this.authors = new ArrayList<Author>();
        this.publishedDate = null;
        this.page = 0;
        this.code = 0;
        this.id = 0;
        this.lang =null;

        idGenerator++;
        this.id = idGenerator;
    }

    public Book(String title,
            String publisher,
            ITagList ganre,
            ArrayList<Author> authors,
            int page,
            Date publishedDate,
            int code,
            ITagList lang) {

        this.title = title;
        this.publisher = publisher;
        this.ganre = ganre;
        this.authors = authors;
        this.publishedDate = publishedDate;
        this.page = page;
        this.code = code;
        this.id = 0;
        this.lang = new TagList("ganre");
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

    public void setGanre(ITagList ganre) {
        this.ganre = ganre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setIdGenerator(int idGenerator) {
        Book.idGenerator = idGenerator;
    }

    public void setLang(ITagList lang) {
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

    public ITagList getGanre() {
        return ganre;
    }

    public int getId() {
        return id;
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public ITagList getLang() {
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