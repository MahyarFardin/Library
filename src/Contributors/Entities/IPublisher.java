package Contributors.Entities;

import Tag.ITagList;

public interface IPublisher {
    public void setCountry(ITagList country);
    public void setName(String name);    
    public String getName();

    public static Publisher creatPublisher() {
        return new Publisher();
    }
}
