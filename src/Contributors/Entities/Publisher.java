package Contributors.Entities;
import Tag.ITagList;

public class Publisher {
    private String name;
    private ITagList country;

    public Publisher(){
        name="";
        country=null;
    }
    public Publisher(String name, ITagList country){
        this.name=name;
        this.country=country;
    }
    public Publisher(Publisher publisher){
        this(publisher.name, publisher.country);
    }

    public void setCountry(ITagList country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    

}
