public class Pay {

    public static double getWeeklyPay(int hours,double payRate){
        return hours * payRate;
    }

    public static double getWeeklyPay(double yearlySalary){
        return yearlySalary / 52;
    }
}
