package inputoutputnewsheadline;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputNewsHeadline {

    public static void main(String[] args) throws FileNotFoundException {

        //New Scanner object to reads user input
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name :");
        String name = input.nextLine();

        System.out.println("Enter the sentence that is the most important news headline that you heard today: ");
        String headlineNews = input.nextLine();

        //Output the user
        System.out.println("------------------------------------------------------");
        System.out.println("Enter your name: " + name);
        System.out.println("The news headline: " + headlineNews);
        System.out.println("------------------------------------------------------");

        //HTML Template + headlineNews
        String htmlTemplate = "<html>\n"
                + "<head>\n"
                + "</head>\n"
                + "<body>\n"
                + "     <center>\n"
                + "     </center>\n"
                + "     <hr/>\n"
                + "     " + headlineNews + "\n"
                + "     <hr/>\n"
                + "</body>\n"
                + "</html>";

        //New PrintWriter object - File : newsHeadline.html
        PrintWriter htmlOutput = new PrintWriter("newsHeadline.html");
        
        //Creating if not existent and Writing HTMLTemplate string inside newsHeadline.html file
        htmlOutput.println(htmlTemplate);

        //Closing the file
        htmlOutput.close();
    }
}
