package phonebookdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookDemo {

    public static void main(String[] args) {

        final int NUM_ENTRIES = 5;

        ArrayList<PhoneBookEntry> list = new ArrayList<>();

        for (int i = 0; i < NUM_ENTRIES; i++) {
            list.add(getEntry());
            System.out.println("");
        }

        System.out.println("Here is the data that you entered.");

        //Enhanced Syntax
        //Normal Syntax
        for (int i = 0; i < list.size(); i++) {
            displayEntry(list.get(i));
        }
    }

    public static PhoneBookEntry getEntry() {

        Scanner input = new Scanner(System.in);

        String name;
        String phoneNumber;

        System.out.println("Enter a person's name: ");
        name = input.nextLine();

        System.out.println("Enter that person's phone number: ");
        phoneNumber = input.nextLine();

        PhoneBookEntry entry = new PhoneBookEntry(name, phoneNumber);

        return entry;
    }

    public static void displayEntry(PhoneBookEntry entry) {
        System.out.println("-------------------------");
        System.out.println("Name: " + entry.getName());
        System.out.println("Phone Number: " + entry.getPhoneNumber());
    }
}
