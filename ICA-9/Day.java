/**
 * Return day of the week
 *
 * @author  Douglas Vinicio
 * @version 1.0
 * @since   2020-07-15
 * @return  day of the week with an name and value.
 */
import java.util.Scanner;

public class Day {

    static Scanner input = new Scanner(System.in);

    /* Instance Variables */
    String dayName;
    int dayNum;
    int dayIncrement;

    /* Array of days */
    String[] week = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    /* Default constructor  */
    public Day(){
        dayNum = 0;
        dayName = week[dayNum];
    }

    /* Setters and Getters methods */
    public void setDayNum(int dayNum){
        this.dayNum = dayNum;
    }

    public void setDayName(String dayName){
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }

    public int getDayNum(){
        return dayNum;
    }

    /* Set the day method / Can be changed anytime */
    public void setDay() {
            /* Defining variable to store user input */
            int selectedDay;
            String day;

            /* Message asking to user enter day of the week */
            System.out.println("Insert the day of the week: ");
            System.out.println("1. Sunday\n" +
                    "2. Monday\n" +
                    "3. Tuesday\n" +
                    "4. Wednesday \n" +
                    "5. Thursday\n" +
                    "6. Friday\n" +
                    "7. Saturday");
            /* Setting user input */
            selectedDay = input.nextInt();
            dayNum = selectedDay - 1;
            dayName = week[dayNum];

            /* Output the result */
            System.out.println("The day selected was " + dayName );
            System.out.println();
    }

    public void incrementDay(){

        /* Reads user input */
        dayIncrement = input.nextInt();

        /* If bigger than 6 (array size)*/
        if(dayIncrement > 6){
            dayNum = (dayNum + dayIncrement) % 7;
            dayName = week[dayNum];
        }

        else {
            dayNum = dayIncrement + dayNum;
            /* Check if dayNum is greater than 7 when new values are added */
            if (dayNum > 6){
                dayNum = dayNum - 7; //If dayNum is greater than 7 divide by numbers of the week.
                dayName = week[dayNum];
            }
            /* Assigning the value in DayName */
            dayName = week[dayNum];
        }
        /* Output the result */
        System.out.println("After adding "+ dayIncrement + " days, the day of the week is " + dayName);
        System.out.println();
    }

    /* Previous day method */
    public void previousDay(){

        //If condition to come back to saturday if Sunday is reached.
        if (dayNum == 0){
            dayNum = 6;
            dayName = week[dayNum];
        } else {
            dayNum--;
            dayName = week[dayNum];
        }
        /* Output the result */
        System.out.println("The previous day is " + dayName);
        System.out.println();
    }

    /* Next day method */
    public void nextDay(){

        //If condition to come back to Sunday if Saturday id reached.
        if (dayNum == 6){
            dayNum = 0;
            dayName = week[dayNum];
        }
        else{
            dayNum++;
            dayName = week[dayNum];
        }
        /* Output the result */
        System.out.println("The next day is " + dayName);
        System.out.println();
    }

    /* Print day method */
    public void printDay(){
        dayName = week[dayNum];
        System.out.println("The day selected is " + dayName);
        System.out.println();
    }
}

