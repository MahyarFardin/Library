package Products;

import Products.Digital.DigitalBook;
import Products.Physical.PhysicalBook;

public interface IBook {
    public static Book CreateBook(boolean type){
        if (type==true) {
            return new PhysicalBook();
        }
        else{
            return new DigitalBook();
        }
    }
}
