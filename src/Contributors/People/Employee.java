package Contributors.People;

import java.util.Calendar;

import Contributors.Enumerators.EGender;
import Contributors.Enumerators.EPosition;

class Employee extends Member {
    private EPosition position;
    private String id;

    public Employee() {
        this.position = EPosition.Ud;
        this.id = id;
    }

    public Employee(String password,
            Calendar joinDate,
            String email,
            String number,
            String firstName,
            String lastName,
            Calendar birthDate,
            EGender gender,
            EPosition position,
            String id) {

        super(password,
                joinDate,
                email,
                number,
                firstName,
                lastName,
                birthDate,
                gender);
                
        this.position = position;
        this.id = id;
    }
}