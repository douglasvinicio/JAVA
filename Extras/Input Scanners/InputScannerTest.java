import java.util.Scanner;

public class
InputScannerTest {

    public static void main (String[] args) {

        //import package_name.*; All
        //import package_name.class; Specific

        int counter;
        counter = 1;

        // Increment Counter by 1;
        counter = counter + 1;
        // Pre-Increment -> ++variable_name
        // Post-Increment -> variable_name++

        // Pre-decrement -> --variable_name
        // Post-decrement -> variable_name--

        // /n -> NewLine

        // Package : collection of related classes.
        // Class : Consist of methods.
        // Method : Designed to accomplish a specific task.


        // class_name object_name = new class_name();
        // Person customer = new Person();
        // Person student = new Person();
        Scanner console = new Scanner(System.in);
        Scanner myObj = new Scanner(System.in); // Create a Scanner Object
        System.out.println("Enter a username: ");

        String userName = myObj.nextLine(); // Read user Input
        System.out.println("The username is: " + userName);

        int feet;
        int inches;
        // User enters two values!
        System.out.println("Insert the Feet :");
        feet = console.nextInt();
        System.out.println("Feet = " + feet);
        System.out.println("Inches = " + (12 * feet));


        System.out.println("Enter First Name : ");
        String firstName  = myObj.nextLine();
        System.out.println("Enter Last Name : ");
        String lastName = myObj.nextLine();
        System.out.println("Enter Weight : ");
        double weight = myObj.nextDouble();
        System.out.println("The fisrt and Last name are : " + firstName + " " +  lastName);
        System.out.println("The weight is : " + weight);




    }
}
