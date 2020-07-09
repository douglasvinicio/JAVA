// Output.java
// Script by : Douglas Vinicio 
// Last Upadate : 30 June, 2020

public class Output {
    public static void main (String[] args){
        String a = "*"; // Setting Variable to Asterisk
        String s = " "; // Setting Variable to Blank Space
        String authorName = "Douglas Vinicio"; // Setting Variable with the Author Name

        System.out.println(a.repeat(34));
        System.out.println(a + s + "Programming ICA-1" + s + a);
        System.out.println(a + s + "Programming I" + s + a);
        System.out.println(a + s + "Author: " + authorName + s + a);
        System.out.println(a + s + "Due Date: Tuesday, June 30, 2020" + s + a);
        System.out.println(a.repeat(34));
    }
}