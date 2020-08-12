import java.util.ArrayList;

public class ExampleArrayList {

    public static void main(String[] args) {

        /* Creating Array List (need to import java.util.ArrayList */
        ArrayList<String> nameList = new ArrayList<>();

        //Populating the array of objects
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        //Get current size, call the size method
        nameList.size();
        System.out.println(nameList.size());

        //Get data inside the array
        System.out.println(nameList.get(0));
        System.out.println(nameList.get(1));

        //Display all the items stored inside the ArrayList
        for (String name : nameList)
            System.out.println(name);

        //Output elements inside the ArrayList
        for (int index = 0; index < nameList.size() ; index++)
            System.out.println("The item number " + index + " is " + nameList.get(index));


    }
}
