import java.util.Scanner;

public class JavaLabs05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        int fCount = 0;

        int gradeInput; // Input by the user.

        System.out.println("Please enter a grade: ");

        gradeInput = input.nextInt();

        if (gradeInput >= 90 && gradeInput <= 100) {
            System.out.println("Excelent Jobs");
            } else if( gradeInput <= 89 && gradeInput >= 75 ) {
            System.out.println("Really good!");
            } else if( gradeInput <= 74 && gradeInput >= 60){
            System.out.println("You're between 60 and 74. We advice you study more!");
            } else if( gradeInput <= 59 && gradeInput >= 40 ){
            System.out.println("You're in danger ground! Please work harder!");
            } else {
            System.out.println("You might decide to do something else!");
            }
        }
    }
