package Contributors.Entities;

import Assets.ELangeANDNationality;

public class Publisher {
    private String name;
    private ELangeANDNationality country;

    public Publisher(){
        name="";
        country=ELangeANDNationality.UD;
    }
    public Publisher(String name, ELangeANDNationality country){
        this.name=name;
        this.country=country;
    }
    public Publisher(Publisher publisher){
        this(publisher.name, publisher.country);
    }
}
