package Contributors.People;

import java.util.Date;

import Tag.ITagList;

class Employee extends Member implements IEmployee{
    private ITagList position;

    public Employee() {
        this.position = null;
    }

    public Employee(String password,
            Date joinDate,
            String email,
            String number,
            String firstName,
            String lastName,
            Date birthDate,
            ITagList gender,
            ITagList position,
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
    public ITagList getPosition() {
        return position;
    }
    public void setPosition(ITagList position) {
        this.position = position;
    }
}