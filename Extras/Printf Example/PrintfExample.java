public class PrintfExample {
    public static void main(String[] args){
        double dblTotal = 123000.456789;
        int intValue = 6789;
        String strValue = "Java Programming 1";

        System.out.printf("Total is: $%,.2f%n", dblTotal);
        System.out.println();
        System.out.printf("Total: $%,.2f%n " ,dblTotal);
        System.out.println();
        System.out.printf("%10d", intValue);
        System.out.println();
        System.out.printf("%300.12s\n", strValue);
    }
}
