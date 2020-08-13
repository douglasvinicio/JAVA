package polymorphic;

public class PassFailExam extends PassFailActivity {

    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public PassFailExam(int questions, int missed, double minPassing) {

        //Invoking superclass constructor at the beginning of the code
        super(minPassing);
        double numericScore;

        this.numQuestions = questions;
        this.numMissed = missed;

        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);

        setScore(numericScore);
    }

    /* Getters */
    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
