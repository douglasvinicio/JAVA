package showvaluedemo;

public class ShowValueDemo {

    public static void main(String[] args) {

        SubClass myObject = new SubClass();

        myObject.showValue(10);
        myObject.showValue(12.5);
        myObject.showValue("Hello");

    }
}
