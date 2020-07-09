public class Exercises2 {
    public static void main(String[] args) {
        // Declare int variables x and y.
        int x = 50;
        int y = 30;
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        // Initialize an int variable x to 10 and a char variable ch to 'B'.
        x = 10;
        char char1 = 'B';
        System.out.println("The new value of x is: " + x);
        System.out.println("The value attributed to char1 is: " + char1);
        // Update the value of an int variable x by adding 5 to it.
        x = x + 5;
        System.out.println("The new value of x is: " + x);
        // Declare and initialize a double variable payRate to 12.50.
        double payRate = 12.5;
        System.out.println("The payrate is: " + payRate);
        // Copy the value of an int variable firstNum into an int variable tempNum.
        int firstNum = 10;
        int tempNum = firstNum;
        System.out.println("The value of both variables firstNum and tempNum is: " + tempNum);
        // Swap the contents of the int variables x and y. (Declare additional
        // variables, if necessary.)
        x = y;
        y = x;
        System.out.println("The new value of x is: " + x);
        System.out.println("The new value of y is: " + y);
        // Suppose x and y are double variables. Output the contents of x, y, and the
        // expression x + 12 / y – 18.
        double x_Double = x;
        double y_Double = y;
        double expression = x_Double + 12 / y_Double - 18;
        System.out.println(expression);
        // Declare a char variable grade and set the value of grade to 'A'.
        char grade = 'A';
        System.out.println("The value of the variable grade is: " + grade);
        // Declare int variables to store four integers.
        int num1, num2, num3, num4;
        // Copy the value of a double variable z to the nearest integer into an int
        // variable x.
        double z = 13.9;
        int new_x = (int) z;
        System.out.println("The old value is " + z + "and the new value is " + new_x);

    }
}