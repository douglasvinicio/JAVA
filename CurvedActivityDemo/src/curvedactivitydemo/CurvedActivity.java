package curvedactivitydemo;

public class CurvedActivity extends GradedActivity {

    double rawScore;
    double percentage;

    public CurvedActivity(double percentage) {
        this.percentage = percentage;
        this.rawScore = 0.0;
    }

    @Override
    public void setScore(double s) {
        this.rawScore = s;
        //Calling the method of the superclass - This is a overriding example.
        super.setScore(this.rawScore * this.percentage);
    }

    public double getRawScore() {
        return rawScore;
    }

    public double getPercentage() {
        return percentage;
    }

}
