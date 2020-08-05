public class StaticDemo {

    public static void main(String[] args) {

        int objectCount;

        Countable obj1 = new Countable();
        Countable obj2 = new Countable();
        Countable obj3 = new Countable();
        Countable obj4 = new Countable();
        Countable obj5 = new Countable();

        objectCount = obj3.getInstanceCount();
        System.out.println(objectCount + " instances of the class were created.");

    }
}
