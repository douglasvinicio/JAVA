import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter three numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();


        int higher = max(a,b,c);

        showResult(higher);
    }

    public static int max(int a, int b, int c){

        int higher = 0;

        if (a > b && a >c)
            higher = a;
        else if (b > c)
            higher = b;
        else higher = c;

        return higher;
    }

    public static void showResult(int higher){
        System.out.println("The higher number is " + higher);
    }
}
