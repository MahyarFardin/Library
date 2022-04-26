package Products.Digital;

import java.util.Date;

import Tag.ITagList;

public interface IDigital {
    
    public void setDateCreated(Date dateCreated);
    public void setFileType(ITagList fileType);
    public void setSize(int size);
    public Date getDateCreated();
    public ITagList getFileType();
    public int getSize();

    public static DigitalBook creatPublisher() {
        return new DigitalBook();
    }
}
