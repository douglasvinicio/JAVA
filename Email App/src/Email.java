import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 8;
    private String alternateEmail;
    private String companySuffix = "company.com";

    //Constructor to receive first and last name
    public Email(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name:");
        this.firstName = input.nextLine();
        System.out.println("Enter the last name:");
        this.lastName = input.nextLine();

        //Call a method asking for the department - return the department
        this.department = setDepartment();

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("A new password was generated.");

        //Setting alternate email
        System.out.println("Enter the alternate email: ");
        alternateEmail = input.nextLine();

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
    }
    //Ask for the department
    private String setDepartment(){
        System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code:");
        Scanner input = new Scanner(System.in);
        int depChoice = input.nextInt();
        if ( depChoice == 1){ return "sales";}
        else if (depChoice == 2){ return "dev";}
        else if (depChoice == 3){ return "acct";}
        else {return "";}
    }
    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
            int random = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    //Set email box capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String toString(){
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany Email : " + email +
                "" +
                "\nMail Box Capacity: " + mailBoxCapacity + "mb" +
                "\nYour password is: " + password +
                "\nYour alternate email is: " + alternateEmail;
    }
}
