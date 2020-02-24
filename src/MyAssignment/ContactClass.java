package MyAssignment;

import java.util.Scanner;

public class ContactClass {
    private Operations list;

    ContactClass() {
        list = new Operations();
    }

    public void addContact() {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.println("You have chosen to add a new contact:");
        System.out.println("Please enter the name of the person");
        System.out.println("First Name: ");
        p.setF_name(sc.nextLine());
        System.out.println("Last Name: ");
        p.setL_name(sc.nextLine());
        System.out.println("Contact Number:");
        String n = sc.nextLine();
        p.setNumbers(n);
        while (true) {
            System.out.print("Would you like to add another contact number? (y/n): ");
            String s = sc.nextLine();
            if (s.equals("y")) {
                System.out.print("Contact Number: ");
                p.setNumbers(sc.nextLine());
            } else {
                break;
            }
        }
        System.out.print("Would you like to add email address? (y/n): ");
        if (sc.nextLine().equals("y")) {
            p.setEmail(sc.nextLine());
        }
        Node node = new Node(p);
        list.add(node);
    }

    public void searchContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You could search for a contact from their first names: ");
        String name = sc.nextLine();
        System.out.println("ok");
        list.find(name);
    }

    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here are all your contacts:");
        list.printList(false);
        System.out.print("Press the number against the contact to delete it: ");
        int t = sc.nextInt();
        list.removeAt(t);
    }

    public void showDetails() {
        list.printList(true);
    }
}
