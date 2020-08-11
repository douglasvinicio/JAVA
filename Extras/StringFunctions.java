public class StringFunctions {

    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DefG      ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2,9);
        String s06 = original.replace('a','x');
        String s07 = original.replace("abc","xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        /* To array string */
        String s = "potate apple lemon";
        String [] vect = s.split(" ");

        System.out.println("Original : -" + original + "-" );
        System.out.println("toLowerCase : -" + s01 + "-" );
        System.out.println("toUpperCase : -" + s02 + "-" );
        System.out.println("trim : -" + s03 + "-" );
        System.out.println("substring 02 : -" + s04 + "-" );
        System.out.println("substring 2,9 : -" + s05 + "-" );
        System.out.println("replace('a', 'x' : -" + s06 + "-" );
        System.out.println("replace('abc', 'xy' : -" + s07 + "-" );
        System.out.println("The index of 'bc' : -" + i + "-" );
        System.out.println("Last index of 'bc' : -" + j + "-" );

        System.out.println("The first item of vector is: " + vect[0]);
        System.out.println("The second item of vector is: " + vect[1]);
        System.out.println("The third item of vector is: " + vect[2]);

    }
}
