import javax.swing.JOptionPane;

public class AdditionGui {
    public static void main(String[] args){
        String firstNumber;
        String secondNumber;

        int number1, number2, sum;

        firstNumber = JOptionPane.showInputDialog("Enter first number: ");
        secondNumber = JOptionPane.showInputDialog("Enter second number: ");

        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);

        sum = number1 + number2;

        JOptionPane.showMessageDialog(null , "The sum of the two values is " + sum , "Addition Result" , JOptionPane.PLAIN_MESSAGE );

        System.exit(0);

    }
}
