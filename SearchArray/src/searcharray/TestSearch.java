package searcharray;

import java.util.Scanner;

public class TestSearch {

    public static void main(String[] args) {

        int[] tests = {87, 75, 98, 100, 82};

        System.out.println("Search for a number inside the array:");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        int result = SearchArray.sequentialSearch(tests, value);

        if (result == -1) {
            System.out.println("You did not earn " + value + " on any test.");
        } else {
            System.out.println("You earned 100 on test " + (result + 1));
        }
    }
}
