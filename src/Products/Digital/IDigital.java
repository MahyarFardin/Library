package Products.Digital;

import java.util.Date;

import Products.Enumerators.EFileType;

public interface IDigital {
    
    public void setDateCreated(Date dateCreated);
    public void setFileType(EFileType fileType);
    public void setSize(int size);
    public Date getDateCreated();
    public EFileType getFileType();
    public int getSize();
}
