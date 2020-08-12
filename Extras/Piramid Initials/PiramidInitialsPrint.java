public class PiramidInitialsPrint {
    public static void main (String[] args){
        String a = "*"; // Setting Variable to Asterisk
        String s = " "; // Setting Variable to Blank Space
        // First Row
        System.out.print(a.repeat(11) + s.repeat(9)); System.out.print(a.repeat(2) + s.repeat(16) + a.repeat(2)); System.out.println();
        // Second Row
        System.out.print(a.repeat(2) + s.repeat(9) + a.repeat(2) + s.repeat(8)); System.out.print(a.repeat(2) + s.repeat(14) + a.repeat(2)); System.out.println();
        // Third Row
        System.out.print(a.repeat(2) + s.repeat(11) + a.repeat(2) + s.repeat(7)); System.out.print(a.repeat(2) + s.repeat(12) + a.repeat(2)); System.out.println();
        // Fouth Row
        System.out.print(a.repeat(2) + s.repeat(12) + a.repeat(2) + s.repeat(7)); System.out.print(a.repeat(2) + s.repeat(10) + a.repeat(2)); System.out.println();
        // Fifth Row
        System.out.print(a.repeat(2) + s.repeat(12) + a.repeat(2) + s.repeat(8)); System.out.print(a.repeat(2) + s.repeat(8) + a.repeat(2)); System.out.println();
        // Sixth Row
        System.out.print(a.repeat(2) + s.repeat(12) + a.repeat(2) + s.repeat(9)); System.out.print(a.repeat(2) + s.repeat(6) + a.repeat(2)); System.out.println();
        // Seventh Row
        System.out.print(a.repeat(2) + s.repeat(11) + a.repeat(2) + s.repeat(11)); System.out.print(a.repeat(2) + s.repeat(4) + a.repeat(2)); System.out.println();
        // Eight Row
        System.out.print(a.repeat(2) + s.repeat(10) + a.repeat(2) + s.repeat(13)); System.out.print(a.repeat(2) + s.repeat(2) + a.repeat(2)); System.out.println();
        // Ninth Row
        System.out.print(a.repeat(11) + s.repeat(17)); System.out.print(a.repeat(4)); System.out.println();
        }
    }

