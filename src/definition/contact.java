package definition;

import java.util.ArrayList;

public class contact {
    String FirstName;
    String LastName;
    String Email;
    ArrayList<String> Phonenumber;


    public contact(String firstName, String lastName, String email, ArrayList<String> phonenumber) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Phonenumber = phonenumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public ArrayList<String> getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(ArrayList<String> phonenumber) {
        Phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return ("---Here are all your contacts---\n" +
                "-------- * -------- * -------- * --------\n" +
                "FirstName:" + getFirstName() + "\nLastName:" + getLastName() + "\nContact Number(s)" + getPhonenumber()
                + "\nEmail address" + getEmail() +
                "\n-------- * -------- * -------- * --------" +
                "\n-------- * -------- * -------- * --------");


    }

}
