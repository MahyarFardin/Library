package Contributors.People;

import java.util.Date;

public interface IMember {
    public String getEmail();
    public int getId();
    public Date getJoinDate();
    public String getNumber();
    public void setEmail(String email);
    public void setId(int id);
    public void setNumber(String number);
    public void setJoinDate(Date joinDate);
    public void setPassword(String password);
}
