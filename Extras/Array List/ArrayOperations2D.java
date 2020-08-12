public class ArrayOperations2D {

    /* Get Total method */
    public static int getTotal(int [][] array){

        // Declaring total variable
        int total = 0;

        /*For nested loop to scan every element inside the 2 dimensional array*/
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col ++){
                total += array[row][col];
            }
        }
        //Return the value of total of elements of the array.
        return total;
    }

    /* GetAverage Method */
    public static double getAverage(int [][] array){

        //Casting the result to double
        return (double) getTotal(array) / getElementCount(array);
    }

    /* getRowTotal Method */
    public static int getRowTotal(int [][] array, int row){
        int total = 0;

        for (int col = 0; col < array[row].length; col++){
            total += array[row][col];
        }
        return total;
    }

    /* getHighestRow Method */
    public static int getHighestInRow(int [][] array, int row){

        int highest = array[row][0];

        for (int col = 0; col < array[row].length; col++){
            if (array[row][col] > highest){
                highest = array[row][col];
            }
        }
        return highest;
    }

    /* getLowestInRow Method */
    public static int getLowestInRow(int [][] array, int row){

        int lowest = array[row][0];

        for (int col = 0; col < array[row].length; col++){
            if (array[row][col] < lowest){
                lowest = array[row][col];
            }
        }
        return lowest;
    }

    /* getColumnTotal Method */
    public static int getColumnTotal(int [][] array, int col){
        int total = 0;

        for (int row = 0; row < array.length; row++){
            total += array[row][col];
        }
        return total;
    }

    /* getElementCount Method */
    public static int getElementCount(int[][] array){

        int count = 0;

        for (int row = 0; row < array.length; row++)
            count += array[row].length;

        return count;
    }


}
