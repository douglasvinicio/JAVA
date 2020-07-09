import java.util.Scanner;

/* Sentinel-controlled while loop example */
public class LoopSentinelControlled {

    /* New Scanner Object */
    static Scanner input = new Scanner(System.in);
    /* Const Variable to break loop */
    static final int SENTINEL = -999;

    public static void main(String[] args){
        int number;
        int sum = 0;
        int count = 0;

        System.out.println("Enter positive integers and enter " + SENTINEL + " value to stop the input.");
        number = input.nextInt(); //Reads user input and save into number.

        while (number != SENTINEL){
            sum = sum + number;
            count++;
            number = input.nextInt();
        }

        System.out.printf("The sum of the %d numbers entered by you is = %d%n", count , sum);

        if (count != 0)
            System.out.printf("The average is = %d%n", sum / count);
        else
            System.out.println("No input");


    }
}
