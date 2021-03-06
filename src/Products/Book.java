package Products;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

import Contributors.People.Author;
import Log.LogCollector;
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
    protected int barrowLog;
    protected static int numberOfCopies;

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
        this.numberOfCopies=0;

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
            ITagList lang,
            int numberOfCopies) {

        this.title = title;
        this.publisher = publisher;
        this.ganre = ganre;
        this.authors = authors;
        this.publishedDate = publishedDate;
        this.page = page;
        this.code = code;
        this.id = 0;
        this.lang = new TagList("ganre");
        this.numberOfCopies=numberOfCopies;
        idGenerator++;
        this.id = idGenerator;

        LogCollector.Logger("new book created"+"    "+this.getTitle());
    }

    public Book(Book book) {
        this(book.title, book.publisher, book.ganre, new ArrayList<>(book.authors), book.page, book.publishedDate,
                book.code, book.lang, numberOfCopies);
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
    public void setBarrowLog(int barrowLog) {
        this.barrowLog = barrowLog;
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

    public int getNumberOfCopies() {
        return numberOfCopies;
    }
    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
    public int getBarrowLog() {
        return barrowLog;
    }
}