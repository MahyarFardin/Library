package Products.Physical;

import Products.Book;
import Transactions.IBarrowable;

public class PhysicalBook extends Book implements IPhysical, IBarrowable{
    private int sizeType;
    private int healthState;

    public PhysicalBook() {
        super();
        sizeType=0;
        healthState=0;
    }
}
