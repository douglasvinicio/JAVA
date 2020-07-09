/*
inClassActivities3.java
Script by : Douglas Vinicio
Date : July 04, 2020 
*/

import java.util.Scanner;
public class inClassActivities3 {
    public static void main (String[] args){
        
        // Code for Exercise 3-4. 
        System.out.println();
        System.out.println("This is the code for the exercise 3-4 : ");
        System.out.println();

        // Assigning Variebles as num_1 and num_2 to not interfere with the exercise 3-5.
        int num_1,num_2;
        Scanner input = new Scanner(System.in); // Creating the Scanner Object.
        System.out.println("Insert two numbers: ");
        num_1 = input.nextInt(); // Reading user input for num_1.
        num_2 = input.nextInt(); // Reading user input for num_2.
        System.out.println("The first number is : " + num_1);
        System.out.println("The second number is : " + num_2);
        System.out.println("The result of the expression 2." + num_1 + "-" + num_2 + " is : " + (2 * num_1 - num_2));

        
        // Code for Exercise 3-5.
        System.out.println();
        System.out.println("This is the code for the exercise 3-5 : ");
        System.out.println();
        double num1,num2,num3,num4,num5; // Assigning 5 double variables.

        System.out.println("Insert the first value: ");
        num1 = input.nextInt(); // Reading user input for num1.
        System.out.println("Insert the second value: ");
        num2 = input.nextInt(); // Reading user input for num2.
        System.out.println("Insert the third value: ");
        num3 = input.nextInt(); // Reading user input for num3.
        System.out.println("Insert the fourth value: ");
        num4 = input.nextInt(); // Reading user input for num4.
        System.out.println("Insert the fifth value: ");
        num5 = input.nextInt(); // Reading user input for num5.
        System.out.println("The first number is :" + num1);
        System.out.println("The second number is :" + num2);
        System.out.println("The third number is :" + num3);
        System.out.println("The fourth number is :" + num4);
        System.out.println("The fifth number is :" + num5);

        // Converting doubles into the nearest Integers.
        int int_num1 = (int) Math.round(num1);
        int int_num2 = (int) Math.round(num2);
        int int_num3 = (int) Math.round(num3);
        int int_num4 = (int) Math.round(num4);
        int int_num5 = (int) Math.round(num5);

        System.out.println(); // Blank line.
        System.out.println("Those are the values converted to the nearest integers: ");
        System.out.println("1 - First Value = " + int_num1);
        System.out.println("2 - Second Value = " + int_num2);
        System.out.println("3 - Third Value = " + int_num3);
        System.out.println("4 - Fourth Value = " + int_num4);
        System.out.println("5 - Fifth Value = " + int_num5);

        // Creating Variables to store the sum and average of the values.
        int sum = int_num1 + int_num2 + int_num3 + int_num4 + int_num5;
        int average = sum / 5;
        System.out.println();
        System.out.println("The total sum of the five values is : " + (sum)); // Printing the Sum of all values.
        System.out.println("The average of the five values is : " + (average)); // Printing the Average of the values.

    }
}
