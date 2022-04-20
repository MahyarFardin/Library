package Contributors.People;

import java.util.*;

import Contributors.Enumerators.EGender;

public class Person implements IPerson {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private EGender gender;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthDate = null;
        this.gender = EGender.UD;
    }

    public Person(String firstName,
            String lastName,
            Date birthDate,
            EGender gender) {

        this.firstName = "";
        this.lastName = "";
        this.birthDate = birthDate;
        this.gender = EGender.UD;
    }

    public Person(Person person) {
        this(person.firstName, person.lastName,new Date(person.birthDate.getTime()), person.gender);
    }
}
