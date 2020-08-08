package arrayoperations2ddemo;

public class ArrayOperations2DDemo {

    public static void main(String[] args) {

        /* New 2D Array */
        int[][] iArray = {{2, 1, 9}, {7, 3, 4}};

        // Total
        System.out.println("Total: " + ArrayOperations2D.getTotal(iArray));
        // Average
        System.out.println("Average: " + ArrayOperations2D.getAverage(iArray));
        //Total Row
        System.out.println("Total of row 0: " + ArrayOperations2D.getRowTotal(iArray, 0));
        System.out.println("Total of row 1: " + ArrayOperations2D.getRowTotal(iArray, 1));
        //Total Column 0
        System.out.println("Total of column 0: " + ArrayOperations2D.getColumnTotal(iArray, 0));
        System.out.println("Total of column 2: " + ArrayOperations2D.getColumnTotal(iArray, 2));
        //Highest in Row
        System.out.println("Highest in Row 0: " + ArrayOperations2D.getHighestInRow(iArray, 0));
        System.out.println("Highest in Row 1: " + ArrayOperations2D.getHighestInRow(iArray, 1));
        //Lowest in Row
        System.out.println("Lowest in Row 0: " + ArrayOperations2D.getLowestInRow(iArray, 0));
        System.out.println("Lowest in Row 1: " + ArrayOperations2D.getLowestInRow(iArray, 1));

    }
}
