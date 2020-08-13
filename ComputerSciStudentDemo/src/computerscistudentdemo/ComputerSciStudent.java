package computerscistudentdemo;

public class ComputerSciStudent extends Student {

    private final int MATH_HOURS = 20;
    private final int CS_HOURS = 40;
    private final int GEN_ED_HOURS = 60;

    private int mathHours, csHours, genEdHours;

    //New constructor matching superclass
    public ComputerSciStudent(String n, String id, int year) {
        super(n, id, year);
    }

    /* Setters */
    public void setMathHours(int math) {
        this.mathHours = math;
    }

    public void setCsHours(int cs) {
        this.csHours = cs;
    }

    public void setGenEdHours(int genEd) {
        this.genEdHours = genEd;
    }

    @Override
    public String toString() {
        String str;

        str = super.toString()
                + "\nMajor: Computer Science "
                + "\nMath Hours Taken: " + mathHours
                + "\nComputer Science Hours Taken: " + csHours
                + "\nGeneral Ed Hours Taken: " + genEdHours;

        return str;
    }

    //Method from abstract created
    @Override
    public int getRemainingHours() {
        int reqHours, remainingHours;

        reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
        remainingHours = reqHours - (mathHours + csHours + genEdHours);

        return remainingHours;
    }

}
