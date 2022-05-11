package Tag;

import java.util.ArrayList;

public class TagList implements ITagList{
    private ArrayList<Tag> tagList;
    private String name;

    public TagList(ITagList list){
        new TagList(list);
    }
    public TagList(String name){
        this.name=name;
        this.tagList= new ArrayList<>();
    }
    public TagList(){
        this.name=null;
        this.tagList=null;
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
    public boolean addTag(Tag name) {
        for (Tag tag: tagList){
            if (!tag.equals(name))
                tagList.add(name);
        }
        return false;          
    }

    

}
