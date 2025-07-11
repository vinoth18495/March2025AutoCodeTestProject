package RestAssured_API;

import java.util.List;

public class Employee {

    private String firstName;
    private String LastName;
    private String Mail;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    private List list;



}
