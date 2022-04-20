package Tag;

public interface ITag {
    public void setName(String name);
    public String getName();

    static Tag createTag(String name){
        return new Tag(name);
    }
}
