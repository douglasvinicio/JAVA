import java.util.Scanner;

public class GradeCounter {

    /* New Scanner object */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        /* Store users input */
        double gradeInput;

        /* Store the number of grades entered by the user */
        int gradeCounter = 0;

        /* Grades A to E */
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        /* Declaring variable to store invalid inputs */
        int invalidInput = 0;

        /* Declaring variable to store the Class Average grades */
        double classAverage = 0;

        /* Sum of all the grades */
        double total = 0;



        System.out.println("Enter the integer grades in the range 0-100.\n" +
                "Type the end-of-file indicator to terminate input:\n" +
                "   On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter\n" +
                "   On Windows type <Ctrl> z then press Enter");
        System.out.println("(Ps: Values out of 0-100 will be counted as not valid and will not be part of the average grade)");
        System.out.println();
        System.out.println("Please enter a grade: ");


        while(input.hasNext()){
            System.out.println("Please enter a grade: ");
            gradeInput = input.nextDouble();
            gradeCounter++;
            if (gradeInput >= 0 && gradeInput <=100){
                total += gradeInput;
            }

            if (gradeInput >= 90 && gradeInput <= 100) { //Grade A
                ++aCount;
            } else if( gradeInput >= 80 && gradeInput <= 89 ) { //Grade B
                ++bCount;
            } else if( gradeInput >= 70  && gradeInput <= 79){ //Grade C
                ++cCount;
            } else if( gradeInput >= 60 && gradeInput <= 69 ){ //Grade D
                ++dCount;
            } else if( gradeInput < 59 && gradeInput >= 0) { //Grade E
                ++eCount;
            } else {
                ++invalidInput;
            }
        }

        /* Calculating Class Average - Formula */
        classAverage = total / gradeCounter;

        /* Output result to the user */
        System.out.printf("%nGrade Report:\n" +
                "Total of the %d grades entered is %d\n" +
                "Class average is %.2f%n%n" , gradeCounter , (int)total , classAverage ); //Total value converted to integer.
        System.out.println("Number of students who received each grade: ");
        System.out.println("Grades \t  Frequency");
        System.out.println("----- \t  ---------");
        System.out.printf("A\t%8d%nB\t%8d%nC\t%8d%nD\t%8d%nE\t%8d%n" , aCount,bCount, cCount,dCount, eCount);
        System.out.println("");
        System.out.println("The number of invalid inputs is " + invalidInput);

    }
}
