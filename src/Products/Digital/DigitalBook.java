package Products.Digital;
import java.util.Calendar;

import Products.Book;
import Products.Enumerators.EFileType;
import Transactions.IBarrowable;

public class DigitalBook extends Book implements IDigital, IBarrowable{
    private int size;
    private Calendar dateCreated;
    private EFileType fileType;

    public DigitalBook(){
        super();
        size=0;
        dateCreated.set(0,0,0);
        fileType=EFileType.UD;
    }
}
