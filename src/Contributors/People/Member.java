package Contributors.People;

import java.util.Calendar;

import Contributors.Enumerators.EGender;

public class Member extends Person {
    private int id;

    private String password;
    private Calendar joinDate;
    private String email;
    private String number;

    public Member() {
        super();
        password = "";
        joinDate.set(0, 0, 0);
        email = "";
        number = "";
    }

    public Member(String password,
            Calendar joinDate,
            String email,
            String number,
            String firstName,
            String lastName,
            Calendar birthDate,
            EGender gender) {

        super(firstName, lastName, birthDate, gender);

        this.password = password;
        this.joinDate = joinDate;
        this.email = email;
        this.number = number;

    }

}
