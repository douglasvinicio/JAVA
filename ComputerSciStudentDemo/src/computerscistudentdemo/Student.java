package computerscistudentdemo;

public abstract class Student {

    private String name;
    private String idNumber;
    private int yearAdmitted;

    //New Constructor
    public Student(String n, String id, int year) {

        this.name = n;
        this.idNumber = id;
        this.yearAdmitted = year;
    }

    public String toString() {
        String str;
        str = "Name: " + name + "\n"
                + "Number: " + idNumber + "\n"
                + "Year Admitted: " + yearAdmitted;
        return str;
    }

    //New abstract method - it has no body just a header and it finishes with a semicolon ;
    public abstract int getRemainingHours();
}
