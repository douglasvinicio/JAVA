import java.util.Scanner;

public class JavaLabs03 {
    public static void main(String[] args){
        /* Ternary Operator */

        /* Initalizing */
        String result;
        double grade;

        /* New Scanner object */
        Scanner input = new Scanner(System.in);

        /* Read user input */
        System.out.println("Enter a grade of the student: ");
        grade = input.nextDouble();

        /*  Ternary operator example */
        result = (grade >= 60) ? "Passed" : "Failed";
        System.out.println(result);
    }
}
