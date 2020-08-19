package coursegradesdemo;

public class CourseGrades implements Analyzable {

    public final int NUM_GRADES = 4;

    private GradedActivity[] grades;

    public CourseGrades() {

        grades = new GradedActivity[NUM_GRADES];

    }

    public void setLab(GradedActivity aLab) {

        grades[0] = aLab;
    }

    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }

    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }

    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }

    @Override
    public double getAverage() {
        double total = 0.0;
        double average;

        for (int i = 0; i < grades.length; i++) {
            total += grades[i].getScore();
        }

        average = total / grades.length;

        return average;
    }

    public GradedActivity getHighest() {
        double highScore = grades[0].getScore();
        int index = 0;

        for (int i = 1; i < grades.length; i++) {
            if (grades[i].getScore() > highScore) {
                highScore = grades[i].getScore();
                index = i;
            }
        }

        return grades[index];
    }

    public GradedActivity getLowest() {
        double lowScore = grades[0].getScore();
        int index = 0;

        for (int i = 1; i < grades.length; i++) {
            if (grades[i].getScore() < lowScore) {
                lowScore = grades[i].getScore();
                index = i;
            }
        }

        return grades[index];
    }

    public String toString() {
        String str = "Lab Score: " + grades[0].getScore()
                + "\tGrade: " + grades[0].getGrade()
                + "\nPass/Fail Exam Score: " + grades[1].getScore()
                + "\tGrade: " + grades[1].getGrade()
                + "\nEssay Score: " + grades[2].getScore()
                + "\tGrade: " + grades[2].getGrade()
                + "\nFinal Exam Score: " + grades[3].getScore()
                + "\tGrade: " + grades[3].getGrade();

        return str;
    }

}
