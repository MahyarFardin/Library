package Products;

import java.util.ArrayList;

import Assets.ELangeANDNationality;
import Products.Enumerators.EGanre;
import Contributors.Author;

public class Book implements IBook{
    private String title;
    private String publisher;
    private EGanre ganre;
    private ArrayList<Author> authors;
    private int page;
    private int year;
    private int code;
    public int id;
    private ELangeANDNationality lang;
    private static int idGenerator;

    public Book(){
        title="";
        publisher="";
        ganre=EGanre.UD;
        authors=new ArrayList<Author>();
        page=0;
        code=0;
        id=0;
        lang=ELangeANDNationality.UD;
        idGenerator++;
        id=idGenerator;
    }

    
}