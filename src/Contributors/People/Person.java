package Contributors.People;

import java.util.*;
import Tag.ITagList;


public class Person implements IPerson {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private ITagList gender;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthDate = null;
        this.gender = null;
    }

    public Person(String firstName,
            String lastName,
            Date birthDate,
            ITagList gender) {

        this.firstName = "";
        this.lastName = "";
        this.birthDate = birthDate;
        this.gender = null;
    }

    public Person(Person person) {
        this(person.firstName, person.lastName,new Date(person.birthDate.getTime()), person.gender);
    }

    @Override
    public void setBirthDate(Date birthDate) {
        this.birthDate=birthDate;
        
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName=firstName;
        
    }

    @Override
    public void setGender(ITagList gender) {
        this.gender=gender;
        
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName=lastName;
        
    }

    @Override
    public Date getBirthDate() {
        return new Date(this.birthDate.toString());
    }

    @Override
    public String getFirstName() {
        return new String(this.firstName);
    }

    @Override
    public ITagList getGender() {
        return this.gender;
    }

    @Override
    public String getLastName() {
        return new String(this.lastName);
    }
}
