package Tag;

public class Tag implements ITag{
    private String name;

    public Tag(){
        name="";
    }
    public Tag(String name){
        this.name=name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
