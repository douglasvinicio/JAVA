package filesumdemo;

import java.io.*;
import java.util.Scanner;

public class FileSum {

    private double sum;

    public FileSum(String filename) throws FileNotFoundException {
        String str;

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        sum = 0.0;

        while (inputFile.hasNext()) {
            double number = inputFile.nextDouble();
            sum = sum + number;
        }
    }

    public double getSum() {
        return sum;
    }
}
