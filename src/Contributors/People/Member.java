package Contributors.People;

import java.util.Date;

import Contributors.Enumerators.EGender;

public class Member extends Person {
    
    private int id;
    private String password;
    private Date joinDate;
    private String email;
    private String number;

    public Member() {
        super();
        password = "";
        joinDate = null;
        email = "";
        number = "";
        id=0;
    }

    public Member(String password,
            Date joinDate2,
            String email,
            String number,
            String firstName,
            String lastName,
            Date birthDate,
            EGender gender) {

        super(firstName, lastName, birthDate, gender);

        this.password = password;
        this.joinDate = joinDate2;
        this.email = email;
        this.number = number;

    }

    public Member(Member member) {
        super(member);

        this.password = member.password;
        this.joinDate = new Date(member.joinDate.getTime());
        this.email = member.email;
        this.number = member.number;
    }
}
