package coursegradesdemo;

public class CourseGrades {
    
    public final int NUM_GRADES = 4;
    
    private GradedActivity[] grades;
    
    public CourseGrades(){
        
        grades = new GradedActivity[NUM_GRADES];
    
    }
    
    public void setLab(GradedActivity aLab){
        
        grades[0] = aLab;
    }
    
    public void setPassFailExam(PassFailExam aPassFailExam){
        grades[1] = aPassFailExam;
    }
    
    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }
    
    public void setFinalExam(FinalExam aFinalExam){
        grades[3] = aFinalExam;
    }
    
    public String toString(){
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
