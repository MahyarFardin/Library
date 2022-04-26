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
}
