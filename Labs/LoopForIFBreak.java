import java.util.Scanner;

public class LoopForIFBreak {

    static final int MAX_NUMBER = 10;
    public static void main(String[] args){
        /* New object Scanner */
        Scanner input = new Scanner(System.in);

        int counter;

        for( counter = 1; counter <= MAX_NUMBER; counter++){
            if (counter == 10){
                break;
            }
            if (counter == 4){
                continue;
            }
            System.out.println(counter);
        }
        System.out.println("Used continue to skip");
    }
}
