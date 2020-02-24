package MyAssignment;

import java.util.ArrayList;

public class Person {
    private String f_name;
    private String l_name;
    private String email;
    private ArrayList<String> numbers = new ArrayList<>();

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumbers(String n) {
        numbers.add(n);
    }

    public void showNumber() {
        if (numbers.size() > 1)
            System.out.println("Contact Number(s) :");
        else
            System.out.println("Contact Number :");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }

    public void showPerson() {
        System.out.println("-------- * -------- * -------- * --------");
        System.out.println("First Name: " + f_name);
        System.out.println("Last Name: " + l_name);
        showNumber();
        System.out.println("\n" + "Email address: " + email);
        System.out.println("-------- * -------- * -------- * --------");
    }


}

