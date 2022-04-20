package Contributors.People;

import Contributors.Enumerators.EPosition;

public interface IEmployee {
    public String getId();
    public EPosition getPosition();
    public void setId(String id);
    public void setPosition(EPosition position);
}
