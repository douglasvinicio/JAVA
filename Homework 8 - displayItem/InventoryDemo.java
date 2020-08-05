public class InventoryDemo {

    public static void main(String[] args) {

        InventoryItem item1,item2,item3;

        item1 = new InventoryItem();
        displayItem(item1);


        item2 = new InventoryItem("Wrench");
        displayItem(item2);

        item3 = new InventoryItem("Hammer" , 20);
        displayItem(item3);

    }

    public static void displayItem(InventoryItem i){
        System.out.println("Description: " + i.getDescription());
        System.out.println("Units: " + i.getUnits());
        System.out.println("");
    }
}
