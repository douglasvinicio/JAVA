package computerscistudentdemo;

public class ComputerSciStudentDemo {

    public static void main(String[] args) {

        ComputerSciStudent csStudent = new ComputerSciStudent("John Doe", "1234", 2012);
        csStudent.setCsHours(12);
        csStudent.setGenEdHours(20);
        csStudent.setMathHours(50);
        System.out.println(csStudent);
        System.out.println("Remaining Hours: " + csStudent.getRemainingHours());
    }
}
