package Tag;

import java.util.ArrayList;

public class TagList implements ITagList{
    private ArrayList<Tag> tagList= new ArrayList<>();
    private String name;

    public TagList(String name){
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

    @Override
    public boolean hasTag(String name) {
        for (Tag tag: tagList){
            if (tag.equals(name))
                return true;
        }
        return false;        
    }

    @Override
    public boolean removeTag(String name) {
        for (Tag tag: tagList){
            if (tag.equals(name))
                tagList.remove(tag);
        }
        return false;   
    }

    @Override
    public boolean addTag(String name) {
        for (Tag tag: tagList){
            if (!tag.equals(name))
                tagList.add(tag);
        }
        return false;          
    }

    

}