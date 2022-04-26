package Contributors.People;
import java.util.Date;

import Assets.ELangeANDNationality;
import Contributors.Enumerators.EGender;
import Tag.ITagList;

public class Author extends Person implements IAuthor{

    private ITagList nationality;

    public Author(){
        nationality=null;
    }

    public Author(String fName, String lName, Date time, ITagList nat, ITagList gender){
        super(fName, lName, time, gender);
        this.nationality=nat;
    }

    public Author(Author author){
        super(author);
        nationality=author.nationality;        
    }

    @Override
    public void setNationality(ITagList nationality) {
        this.nationality = nationality;
    }
    @Override
    
    public ITagList getNationality() {
        return nationality;
    }
    
}