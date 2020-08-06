package monthdemo;

public class MonthDemo {

    public static void main(String[] args) {
        
        Month m = new Month();

        System.out.println("Month " + m.getMonthNumber() + " is " + m);
        System.out.println("-----");
        for (int i = 1; i <= 13; i++) {
            m.setMonthNumber(i);
            System.out.println("Month " + m.getMonthNumber() + " is " + m);
        }

        Month m1 = new Month(10);
        Month m2 = new Month(5);

        System.out.println();
        System.out.println("Month " + m1.getMonthNumber() + " is " + m1);
        System.out.println("Month " + m2.getMonthNumber() + " is " + m2);
        System.out.println();

        if (m1.equals(m2)) {
            System.out.println(m1 + " are equal to " + m2);
        } else {
            System.out.println(m1 + " and " + m2 + " are not equals.");
        }

        if (m1.greaterThan(m2)) {
            System.out.println(m1 + " is greater than " + m2);
        } else {
            System.out.println(m1 + " is NOT greater than " + m2);
        }

        if (m1.lessThan(m2)) {
            System.out.println(m1 + "is less than " + m2);
        } else {
            System.out.println(m1 + " is NOT less than " + m2);
        }

        Month m11 = new Month("March");
        Month m12 = new Month("December");
        Month m13 = new Month("Bad Month");

        System.out.println("Month " + m11.getMonthNumber() + " is " + m11);
        System.out.println("Month " + m12.getMonthNumber() + " is " + m12);
        System.out.println("Month " + m13.getMonthNumber() + " is " + m13);

    }
}
