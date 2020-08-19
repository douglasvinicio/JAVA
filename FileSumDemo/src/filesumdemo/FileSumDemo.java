package filesumdemo;

import java.io.FileNotFoundException;

public class FileSumDemo {

    public static void main(String[] args) throws FileNotFoundException {

        FileSum fs = new FileSum("myFile.txt");
        System.out.println("The sum of the values in the file is: " + fs.getSum());
    }
}
