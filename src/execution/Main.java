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
        ArrayList<String> phoneNumber = new ArrayList<>();
        String MobNumber;
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
                        System.out.println("Please enter the name");
                        sc.next();
                        System.out.println("First Name:");
                        firstName = sc.next();
                        System.out.println("Last Name:");
                        lastName = sc.next();
                        fullName.add(firstName + lastName);
                        System.out.println("Phone Number:");
                        MobNumber = sc.next();
                        phoneNumber.add(MobNumber);
                        System.out.println("Would you like to add another number? (y/n):");
                        choose = sc.next().charAt(0);
                        if (choose == 'y') {
                            System.out.println("Phone Number:");
                            MobNumber = sc.next();
                            phoneNumber.add(MobNumber);
                            System.out.println("Would you like to add another number? (y/n):");

                        } else if (choose == 'n') {
                            break;

                        }
                        System.out.println("Email:");
                        email = sc.next();
                        contact contact = new contact(firstName, lastName, email, phoneNumber);


                        break; // break of case 1
                    case 2:
                        contactList.viewAllContacts();
                        break;//break for case 2

                    case 3:
                        System.out.println("you could search for a contact by their first names:");
                        firstName = sc.next();
                        int counter = 0;
                        for (int j = 0; j < fullName.size(); j++) {
                            if (fullName.get(j).contains(firstName)) {
                                counter++;


                            }
                            System.out.println(counter + " Match Found");
                            break;
                        }
                    case 4:
                        System.out.println("Here are all your contacts");
                        for (int i = 0; i < fullName.size(); i++) {
                            System.out.println(i + 1 + "." + fullName.get(i));
                            System.out.println("Press the number against the contact to delete it:");
                            int number = sc.nextInt();
                            contactList.remove(number - 1);
                            System.out.println(fullName.get(number - 1) + "'s contact deleted");
                            fullName.remove(number - 1);
                            break;

                        }

                    case 5:
                        break;

                    default:
                        System.out.println("sorry , its a wrong choice");
                        break;














                }
            }

        }
    }
}
