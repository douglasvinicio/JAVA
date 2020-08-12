import java.util.Scanner;

public class FinalExamDemo {

    public static void main(String[] args) {

        int questions, missed;

        Scanner input = new Scanner(System.in);

        System.out.println("How many questions are on the final exam?");
        questions = input.nextInt();

        System.out.println("How many questions did the student miss?");
        missed = input.nextInt();

        FinalExam exam = new FinalExam(questions,missed);

        System.out.println("Each question counts " + exam.getPointsEach() + " points");
        System.out.println("The exam score is: " + exam.getScore());
        System.out.println("The exam grade is: " + exam.getGrade());
    }
}
