package Contributors.People;

import java.util.Date;

import Contributors.Enumerators.EGender;
import Contributors.Enumerators.EPosition;

class Employee extends Member implements IEmployee{
    private EPosition position;

    public Employee() {
        this.position = EPosition.Ud;
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
    }

    public Employee(Employee employee){
        super(employee);
        this.position = employee.position;
    }
    public EPosition getPosition() {
        return position;
    }
    public void setPosition(EPosition position) {
        this.position = position;
    }
}