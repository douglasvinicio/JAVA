package polymorphic;

public class PassFailActivity extends GradedActivity {

    private double minPassingScore;

    public PassFailActivity(double mps) {
        this.minPassingScore = mps;
    }

    //Redefining method from superclass GradedActivity
    @Override
    public char getGrade() {
        char letterGrade;

        if (super.getScore() >= this.minPassingScore) {
            letterGrade = 'P';
        } else {
            letterGrade = 'F';
        }

        return letterGrade;
    }

}
