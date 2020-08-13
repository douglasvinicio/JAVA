package relatableexams;

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
    
    //Implementation of methods inside Relatable Interface
    public boolean equals(GradedActivity g) {
        boolean status;
        if (this.getScore() == g.getScore()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public boolean isGreater(GradedActivity g) {
        boolean status;
        if (this.getScore() > g.getScore()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public boolean isLess(GradedActivity g) {
        boolean status;
        if (this.getScore() < g.getScore()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }
}
