package passfailexamdemo;

import java.util.Scanner;

public class PassFailExamDemo {

    public static void main(String[] args) {

        int questions, missed;
        double minPassing;

        Scanner input = new Scanner(System.in);

        System.out.println("How many questions are on the exam?");
        questions = input.nextInt();

        System.out.println("How many questions did the student miss?");
        missed = input.nextInt();

        System.out.println("What is the minimum passing score?");
        minPassing = input.nextDouble();

        PassFailExam exam = new PassFailExam(questions, missed, minPassing);

        System.out.println("Each questions counts " + exam.getPointsEach() + " points");
        System.out.println("The exam score is " + exam.getScore());
        System.out.println("The exam grade is " + exam.getGrade());

    }
}
