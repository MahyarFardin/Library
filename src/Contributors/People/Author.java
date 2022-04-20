package Contributors.People;
import java.util.Date;

import Assets.ELangeANDNationality;
import Contributors.Enumerators.EGender;

public class Author extends Person{

    private ELangeANDNationality nationality;

    public Author(){
        nationality=ELangeANDNationality.UD;
    }

    public Author(String fName, String lName, Date time, ELangeANDNationality nat, EGender gender){
        super(fName, lName, time, gender);
        this.nationality=nat;
    }

    
    public Author(Author author){
        super(author);
        nationality=author.nationality;        
    }
    
    
}