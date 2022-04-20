package Contributors.People;

import java.util.Date;

import Contributors.Enumerators.EGender;
import Contributors.Enumerators.EPosition;

class Employee extends Member {
    private EPosition position;
    private String id;

    public Employee() {
        this.position = EPosition.Ud;
        this.id = "";
    }

    public Employee(String password,
            Date joinDate,
            String email,
            String number,
            String firstName,
            String lastName,
            Date birthDate,
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

    public Employee(Employee employee){
        super(employee);
        this.position = employee.position;
        this.id = employee.id;
    }
}