import java.util.Scanner;

public class PetDemo {

    public static void main(String[] args) {

        /*New Scanner Object */
        Scanner input = new Scanner(System.in);

        /* New Pet Object */
        Pet myPet = new Pet();

        /* Read user input and store inside Pet object */
        System.out.println("Let's get information about your pet.");
        System.out.println("Enter the name of your pet: ");
        myPet.setName(input.nextLine());
        System.out.println("Enter the type of your pet: ");
        myPet.setType(input.nextLine());
        System.out.println("Enter the age of the pet: ");
        myPet.setAge(input.nextInt());

        /* Output to the user */
        System.out.println("");
        System.out.println("Here's the information that you provided: ");
        System.out.println("Pet name: " + myPet.getName());
        System.out.println("Pet type: " + myPet.getType());
        System.out.println("Pet age: " + myPet.getAge());
    }
}
