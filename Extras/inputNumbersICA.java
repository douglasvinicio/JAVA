import java.util.Scanner;

public class inputNumbersICA {
    public static void main (String[] args){
        double num1,num2,num3,num4,num5;
        Scanner input = new Scanner(System.in); // Creating the Scanner Object.
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
        System.out.println("Those are the values converted to the nearest integers: ");
        System.out.println("1 - First Value = " + int_num1);
        System.out.println("2 - Second Value = " + int_num2);
        System.out.println("3 - Third Value = " + int_num3);
        System.out.println("4 - Fourth Value = " + int_num4);
        System.out.println("5 - Fifth Value = " + int_num5);
        // Creating Variables to store the sum and average of the values.
        int sum = int_num1 + int_num2 + int_num3 + int_num4 + int_num5;
        int average = sum / 5;
        System.out.println("The total sum of the five values is : " + (sum)); // Printing the Sum of all values.
        System.out.println("The average of the five values is : " + (average)); // Printing the Average of the values.

    }
}
