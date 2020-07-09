import java.util.Scanner;

public class LoopCounterControlled {
    public static void main(String[] args){

        /* New object Scanner */
        Scanner input = new Scanner(System.in);

        int limit; //Saves the number of times the number will be entered.

        int number; //Stores the numbers entered by the user.
        int sum; //Stores the sum of the numbers.
        int counter; //Controls the loop.

        System.out.println("Enter the number of Integers in the list: ");

        limit = input.nextInt();
        System.out.println();

        /* Initializing Variables */
        sum = 0;
        counter = 0;
        System.out.println("Enter " + limit + " integers.");

        /* While Loop */
        while(counter < limit){
            number = input.nextInt();
            sum = sum + number;
            counter++; //or counter = counter + 1;
        }

        System.out.printf("The sum of the %d numbers = %d%n" , limit , sum);

        if (counter != 0)
            System.out.printf("The average = %d%n", sum / counter);
        else
            System.out.println("Error! No input");

        }
    }

