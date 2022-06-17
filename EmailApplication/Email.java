package EmailApplication;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "pjwstk.edu.pl";

    //Constructor to receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New Worker: " + this.firstName + " " + this.lastName);

        //Call a method asking for the department and return the department
        this.department = setDepartment();
        System.out.println("==================================================================");
        System.out.println("Department: " + this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "" + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    //Ask for the department
    private String setDepartment() {
        System.out.print("\nDEPARTMENT IDS\n1) For Sales\n2) For Development\n3) For Accounting\n0) For NONE\n\nEnter the department id: ");
        Scanner scan = new Scanner(System.in);
        int departmentChoice = scan.nextInt();

        if (departmentChoice == 1) {
            return "SALES";
        } else if (departmentChoice == 2) {
            return "DEVELOPMENT";
        } else if (departmentChoice == 3) {
            return "ACCOUNTING";
        } else
            return "NONE";
    }

    //Generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    //Set mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }
}