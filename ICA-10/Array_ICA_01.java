public class Array_ICA_01 {
    public static void main(String[] args){

        /* a. Declare an array alpha of 15 elements of type int*/
        int[] alpha = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        /* c. Set the value of the fifth element of the array alpha to 35 */
        alpha[14] = 35;

        /*d. Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.*/
        alpha[8] = alpha[5] + alpha[12];

        /*e. Set the value of the fourth element of the array alpha to three times the value of the eighth element, minus 57.*/
        alpha[3] = (alpha[3]*alpha[7]) - 57;

        /* b. Output the value of the tenth element of the array alpha */
        System.out.println("The tenth element of the array alpha is " + alpha[9]);

        for (int i = 0; i < alpha.length; ++i) { //Second loop to output data
            if (i % 5 == 0)
                System.out.println(); // New line after 5 times
            System.out.print(alpha[i] + " ");
        }

    }
}
