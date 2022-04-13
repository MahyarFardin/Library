package Contributors;

import Assets.ELangeANDNationality;
import Contributors.Enumerators.EGender;

public class Author{
    private String firstName;
    private String lastName;
    private ELangeANDNationality nationality;
    private EGender gender;

    public Author(){
        firstName="";
        lastName="";
        nationality=ELangeANDNationality.UD;
        gender=EGender.UD;
    }
    
}