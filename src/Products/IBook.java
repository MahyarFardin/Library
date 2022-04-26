package Products;

import java.util.ArrayList;
import java.util.Date;

import Contributors.People.Author;
import Products.Digital.DigitalBook;
import Products.Physical.PhysicalBook;
import Tag.ITagList;

public interface IBook {
    public void setAuthors(ArrayList<Author> authors);

    public void setCode(int code);

    public void setGanre(ITagList ganre);

    public void setId(int id);

    public void setLang(ITagList lang);

    public void setPage(int page);

    public void setPublishedDate(Date publishedDate);

    public void setPublisher(String publisher);

    public void setTitle(String title);

    public ArrayList<Author> getAuthors();

    public void setBarrowLog(int barrowLog);

    public int getCode();

    public ITagList getGanre();

    public int getId();

    public ITagList getLang();

    public int getPage();

    public Date getPublishedDate();

    public String getPublisher();

    public String getTitle();

    public int getNumberOfCopies();

    public void setNumberOfCopies(int numberOfCopies);

    public int getBarrowLog();
    
    public static Book CreateBook(boolean type){
        if (type==true) {
            return new PhysicalBook();
        }
        else{
            return new DigitalBook();
        }
    }
}
