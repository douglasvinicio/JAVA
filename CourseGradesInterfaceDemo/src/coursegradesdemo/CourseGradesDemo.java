package coursegradesdemo;

public class CourseGradesDemo {

    public static void main(String[] args) {
        
        GradedActivity lab = new GradedActivity();
        
        lab.setScore(85);
        
        PassFailExam pfExam = new PassFailExam(20, 3, 70);
        
        Essay essay = new Essay();
        
        essay.setScore(25, 18, 70, 20);
        
        FinalExam finalExam = new FinalExam(50,10);
        
        CourseGrades course = new CourseGrades();
        
        course.setLab(lab);
        course.setPassFailExam(pfExam);
        course.setEssay(essay);
        course.setFinalExam(finalExam);
        
        System.out.println(course);
        
        System.out.println("Average Score: " + course.getAverage());

        GradedActivity highItem = course.getHighest();
        System.out.println("Highest Score: " + highItem.getScore());

        GradedActivity lowItem = course.getLowest();
        System.out.println("Lowest Score: " + lowItem.getScore());

    }
}
