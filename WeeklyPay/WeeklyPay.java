import java.util.Scanner;

public class WeeklyPay {

    public static void main(String[] args) {

        String selection; //User selection H or S
        int hours; //Number of hours worked
        double hourlyRate; //The hourly Pay Rate
        double yearly; //Yearly Salary

        /* New Scanner Object */
        Scanner input = new Scanner(System.in);

        /* User Selection section */
        System.out.println("To calculate the salary of an employee use one " +
                "of the options. \n H - For hour hourly \n S - For Salaried");
        selection = input.nextLine();

        switch (selection.charAt(0)){
            case 'H':
            case 'h':
                System.out.println("Please enter how many hours: ");
                hours = input.nextInt();
                System.out.println("Enter now the hourly rate: ");
                hourlyRate = input.nextDouble();
                System.out.printf("The weekly gross pay is $%,.2f\n", Pay.getWeeklyPay(hours,hourlyRate));
                break;
            case 'S':
            case 's':
                System.out.println("Please insert the annual salary: ");
                yearly = input.nextDouble();
                System.out.printf("The weekly gross pay is $%,.2f\n", Pay.getWeeklyPay(yearly));
                break;
            default:
                System.out.printf("Invalid selection.");
        }
    }
}
