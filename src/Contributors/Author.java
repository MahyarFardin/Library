package Contributors;
import java.util.Calendar;

import Assets.ELangeANDNationality;
import Contributors.Enumerators.EGender;

public class Author{
    private String firstName;
    private String lastName;
    private Calendar birthDate;
    private ELangeANDNationality nationality;
    private EGender gender;

    public Author(){
        firstName="";
        lastName="";
        nationality=ELangeANDNationality.UD;
        gender=EGender.UD;
        birthDate.set(0,0,0);
    }

    public Author(String fName, String lName, Calendar time, ELangeANDNationality nat, EGender gender){
        this.firstName=fName;
        this.lastName=lName;
        this.birthDate=time;
        this.nationality=nat;
        this.gender=gender;
    }
    
}