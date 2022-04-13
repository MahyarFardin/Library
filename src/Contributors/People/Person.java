package Contributors.People;

import java.util.Calendar;

import Contributors.Enumerators.EGender;

public class Person {
    private String firstName;
    private String lastName;
    private Calendar birthDate;
    private EGender gender;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthDate.set(0, 0, 0);
        this.gender = EGender.UD;
    }

    public Person(String firstName,
            String lastName,
            Calendar birthDate,
            EGender gender) {
                
        this.firstName = "";
        this.lastName = "";
        this.birthDate.set(0, 0, 0);
        this.gender = EGender.UD;
    }
}
