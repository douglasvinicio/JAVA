package showvaluedemo;

public class SubClass extends SuperClass {

    //Overriding Example
    @Override
    public void showValue(int arg) {
        System.out.println("SUBCLASS: The int argument was " + arg);
    }

    //Overloading Example
    public void showValue(double arg) {
        System.out.println("SUBCLASS: The double argument was " + arg);
    }
}
