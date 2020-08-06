package pass2darray;

public class Pass2DArray {

    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}};
        System.out.println("Here are the values in the array: ");
        showArray(numbers);
        System.out.println("The sum of all the values is " + sumArray(numbers));
    }

    public static void showArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.println(array[row][col] + " ");
            }
            System.out.println("");
        }
    }

    public static int sumArray(int[][] array) {

        int total = 0;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                total += array[row][col];
            }
        }
        return total;
    }
}
