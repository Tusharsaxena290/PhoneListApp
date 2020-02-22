package definition;

import java.util.ArrayList;

public class contact {
    String FirstNmae;
    String LastName;
    String Email;
    ArrayList<String> Phonenumber;


    public contact(String firstNmae, String lastName, String email, ArrayList<String> phonenumber) {
        FirstNmae = firstNmae;
        LastName = lastName;
        Email = email;
        Phonenumber = phonenumber;
    }
}
