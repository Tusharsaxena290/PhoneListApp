package execution;

import definition.ContactLinkedList;
import definition.contact;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String firstName;
        String lastName;
        String email;
        char choose;
        int select;
        ContactLinkedList<contact> contactList = new ContactLinkedList<>();
        ArrayList<String> fullName = new ArrayList<>();
        while (true) {
            System.out.println("Welcome to Tushar's Contact List Application\n" +
                    "Press 1 to add the new contact\n" +
                    "Press 2 to view the contacts\n" +
                    "Press 3 to search a contact" +
                    "Press 4 to delete a contact" +
                    "Press 5 to exit the program");
            select = sc.nextInt();
            if (select == 1 || select == 2 || select == 3 || select == 4) {
                switch (select) {
                    case 1:
                        System.out.println("You have chosen to add a new contact:");
                        sc.nextLine();
                        System.out.println("enter the name:");
                        sc.nextLine();
                        System.out.println("First Name:");
                        firstName = sc.nextLine();
                        System.out.println("Last Name:");
                        lastName = sc.nextLine();
                        fullName.add(firstName + lastName);


                }
            }

        }
    }
}
