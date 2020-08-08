package arraylistdemo2;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        //Creating new ArrayList
        ArrayList<String> nameList = new ArrayList<>();

        //Populating ArrayList
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        //Output the size of the ArrayList
        System.out.println("The ArrayList has " + nameList.size() + " objects in it.");

        for (String name : nameList) {
            System.out.println(name);
        }

        System.out.println("The item in position 1 of the array will be removed.");
        nameList.remove(1);

        //Insert item in a already existing position inside the array
        nameList.add(1, "Mary");
        System.out.println("The item Mary has been inserted in position 1");

        //Output elements inside the ArrayList
        for (int index = 0; index < nameList.size(); index++) {
            System.out.println("The item number " + index + " is " + nameList.get(index));
        }

        // Replacing element in specific position
        System.out.println("The item in position 1 has been replaced.");
        nameList.set(1, "Jack");

        for (int index = 0; index < nameList.size(); index++) {
            System.out.println("The item number " + index + " is " + nameList.get(index));
        }

    }
}
