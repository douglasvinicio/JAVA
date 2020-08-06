package objectarray;

import java.util.Scanner;

public class ObjectArray {

    public static void main(String[] args) {

        final int NUM_ITEMS = 3;

        InventoryItem[] inventory = new InventoryItem[NUM_ITEMS];

        getItems(inventory);

        System.out.println("You entered the following: ");
        for (int index = 0; index < inventory.length; index++) {
            System.out.println("Item " + (index + 1));
            System.out.println("Description: " + inventory[index].getDescription());
            System.out.println("Units: " + inventory[index].getUnits());
            System.out.println();
        }
    }

    public static void getItems(InventoryItem[] array) {

        String description;
        int units;

        Scanner input = new Scanner(System.in);

        for (int index = 0; index < array.length; index++) {

            System.out.println("Enter description for "
                    + "item " + (index + 1) + ": ");
            description = input.nextLine();

            System.out.println("Enter the number of units "
                    + "for item " + (index + 1) + ": ");
            units = input.nextInt();

            input.nextLine();

            array[index] = new InventoryItem(description, units);

            System.out.println("");
        }

    }
}
