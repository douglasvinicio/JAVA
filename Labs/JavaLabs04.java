import java.util.Scanner;

public class JavaLabs04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double num1, num2, num3, temp;

        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        System.out.println();

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;

        }

        if (num3 <= num1) {
            System.out.println(num3 + " " + num1 + " " + num2);
        }

        else if (num2 <= num1) {
                System.out.println(num1 + " " + num3 + " " + num2);
            } else {
                System.out.println(num1 + " " + num2 + " " + num3);

        }
    }
}
