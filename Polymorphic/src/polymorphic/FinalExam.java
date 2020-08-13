package polymorphic;

public class FinalExam extends GradedActivity {

    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int questions, int missed) {

        double numericScore;

        this.numQuestions = questions;
        this.numMissed = missed;

        this.pointsEach = 100.0 / questions;

        numericScore = 100.0 - (missed * pointsEach);

        setScore(numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }
}
