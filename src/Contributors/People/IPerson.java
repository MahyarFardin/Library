package Contributors.People;

import java.util.Date;

import Contributors.Enumerators.EGender;

public interface IPerson {
    public void setBirthDate(Date birthDate);

    public void setFirstName(String firstName);

    public void setGender(EGender gender);

    public void setLastName(String lastName);

    public Date getBirthDate();

    public String getFirstName();

    public EGender getGender();

    public String getLastName();

    public static Person IMember(int type) {

        if (type == 0) {
            return new Employee();
        } else if (type == 1) {
            return new Member();
        } else {
            return new Author();
        }
    }
}
