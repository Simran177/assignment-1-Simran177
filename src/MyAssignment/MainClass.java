package MyAssignment;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        ContactClass c = new ContactClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to DBC's Contact List App");
        System.out.println("Press 1 to add a new contact \nPress 2 to view all contacts \n" +
                "Press 3 to search for a contact \nPress 4 to delete a contact \nPress 5 to exit program");
        while (true) {
            System.out.println("Enter your choice");
            int t = sc.nextInt();
            if (t == 1) {
                c.addContact();
            } else if (t == 2) {
                c.showDetails();
            } else if (t == 3) {
                c.searchContact();
            } else if (t == 4) {
                c.deleteContact();
            } else if (t == 5) {
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }
    }
}
