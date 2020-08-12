package curvedactivitydemo;

import java.util.Scanner;

public class CurvedActivityDemo {

    public static void main(String[] args) {

        double score, curvePercent;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the student's raw numeric score: ");
        score = input.nextDouble();

        System.out.println("Enter the curve percentage: ");
        curvePercent = input.nextDouble();

        /* New object created from CurvedActivity Class */
        CurvedActivity curvedExam = new CurvedActivity(curvePercent);

        /* Setter override from GradedActivity */
        curvedExam.setScore(score);

        System.out.println("The raw score is " + curvedExam.getRawScore() + " points");
        System.out.println("The curved score is " + curvedExam.getScore() + " points");
        System.out.println("The final grade is " + curvedExam.getGrade());
    }
}
