import java.util.Scanner;

public class DayTester {

    /* Main method */
    public static void main(String[] args){

        /* New constructor Day */
        Day day = new Day();

        /* New scanner object */
        Scanner input = new Scanner(System.in);

        /* Control loop variable */
        boolean run = true;
        int option;

        /* While loop / - 1 to Terminate */
        while (run){
            System.out.println("Select one option : \n" +
                    "1. Set the day \n" +
                    "2. Next day \n" +
                    "3. Previous day \n" +
                    "4. Increment number of days \n" +
                    "5. Print day \n" +
                    "6. To stop the program");

            /* Reads user input */
            option = input.nextInt();

            /* Conditions to option selected */
            if (option == 1){
                day.setDay(); //Set day method
            } else if (option == 2){
                day.nextDay(); //Next day method
            } else if (option == 3){
                day.previousDay(); //Previous day method
            } else if(option == 4){
                System.out.println("Insert how many days you want to increment : ");
                day.incrementDay(); //Increment day method
            }else if(option == 5){
                day.printDay(); //Print day method
            }else if(option == 6){
                break; //Break the program
            }else{
                System.out.println("Invalid option!");
            }

        }
    }
}
