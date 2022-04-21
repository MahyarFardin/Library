package Tag;

public interface ITagList {
    public void setName(String name);
    public String getName();
    public boolean hasTag(String name);
    public boolean removeTag(String name);
    public boolean addTag(String name);
}
