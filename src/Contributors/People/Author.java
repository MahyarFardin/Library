package Contributors.People;
import java.util.Calendar;

import Assets.ELangeANDNationality;
import Contributors.Enumerators.EGender;

public class Author extends Person{

    private ELangeANDNationality nationality;

    public Author(){
        nationality=ELangeANDNationality.UD;
    }

    public Author(String fName, String lName, Calendar time, ELangeANDNationality nat, EGender gender){
        super(fName, lName, time, gender);
        this.nationality=nat;
    }
    
}