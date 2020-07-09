import java.util.Scanner;

public class ShippingCookies {

    /*New Scanner Object*/
    static Scanner input = new Scanner(System.in);

    /* Const Variables */
    static final int BOX_OF_COOKIES = 24;
    static final int CONTAINER_OF_BOXES = 75;

    /* Main method */
    public static void main(String[] args){

        /* Assigning Variables to store the input Value */
        int cookiesQuantity;

        int boxes; // Store the value of how many boxes.
        int leftoverCookies; //Store the left behind cookies.
        int containers; //Store the value of how many containers are necessary.
        int leftoverBoxes; //Store the left behind boxes.


        /* Reads user input */
        System.out.println("Insert here how many cookies you would like to ship: ");
        cookiesQuantity = input.nextInt();

        /* Expression to calculate how many boxes of cookies */
        boxes = cookiesQuantity / BOX_OF_COOKIES;
        leftoverCookies = cookiesQuantity % BOX_OF_COOKIES;

        /* Output the number of boxes and leftover cookies */
        System.out.println("The number of boxes is: " + boxes);
        System.out.println("The number of leftover cookies is: " + leftoverCookies);

        /* Expression to calculate how many containers */
        containers = boxes / CONTAINER_OF_BOXES;
        leftoverBoxes = boxes % CONTAINER_OF_BOXES;

        /* 
        Output the number of containers and leftover boxes 
        */
        /* If statement if there's not enough boxes to complete a container */
        if (containers == 0){
            System.out.println("There's not enough boxes to fill a whole container.");
            //If statement if there's only one box output in the singular "one box" and for more than one output in the plural "boxes".
            if (boxes == 1){
                System.out.println("There's only one box and you need " + (CONTAINER_OF_BOXES - boxes) + " more to complete the container." ); 
            } else {
            System.out.println("There's " + boxes + " boxes and you need " + (CONTAINER_OF_BOXES - boxes) + " more to complete a full container." );
            }
        }
        /* If statement if there's one or more containers */
        if (containers >= 1){
            System.out.println("The number of containers is: " + containers);
            System.out.println("There's " + leftoverBoxes + " leftover boxes and you need " + (CONTAINER_OF_BOXES - leftoverBoxes) + " more to complete another container." );
        }
    }
}