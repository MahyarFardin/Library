package Products.Digital;
import Products.Book;
import Transactions.IBarrowable;

public class DigitalBook extends Book implements IDigital, IBarrowable{
    private int size;
    private String dateCreated;
    private String fileType;

    public DigitalBook(){
        super();
        size=0;
        dateCreated="";
        fileType="";
    }
}
