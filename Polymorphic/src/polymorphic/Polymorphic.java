package polymorphic;

public class Polymorphic {

    public static void main(String[] args) {

        //New reference variable from superclass GradedActivity
        GradedActivity[] tests = new GradedActivity[3];

        //New GradedActivity superclass object
        tests[0] = new GradedActivity();
        tests[0].setScore(95);

        //New subclass object
        tests[1] = new PassFailExam(20, 5, 60);

        //New subclass object
        tests[2] = new FinalExam(50, 7);

        for (int i = 0; i < tests.length; i++) {
            System.out.println("Test " + (i + 1) + ": score " + tests[1].getScore() + ", grade " + tests[i].getGrade());
        }

    }
}
