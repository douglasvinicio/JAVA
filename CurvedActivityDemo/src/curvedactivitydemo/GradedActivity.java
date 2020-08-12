package curvedactivitydemo;

public class GradedActivity {

    private double score;

    public void setScore(double s) {
        this.score = s;
    }

    public double getScore() {
        return this.score;
    }

    public char getGrade() {

        char letterGrade;

        if (this.score >= 90) {
            letterGrade = 'A';
        } else if (this.score >= 80) {
            letterGrade = 'B';
        } else if (this.score >= 70) {
            letterGrade = 'C';
        } else if (this.score >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        return letterGrade;
    }
}
