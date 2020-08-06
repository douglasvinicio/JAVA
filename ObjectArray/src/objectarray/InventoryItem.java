package objectarray;

public class InventoryItem {

    private String description; //Item description
    private int units; // Units on-hand

    public InventoryItem() {
        description = "";
        units = 0;
    }

    public InventoryItem(String d) {
        this.description = d;
        this.units = 0;
    }

    public InventoryItem(String d, int u) {
        this.description = d;
        this.units = u;
    }

    public void setDescription(String d) {
        description = d;
    }

    public void setUnits(int u) {
        units = u;
    }

    public String getDescription() {
        return description;
    }

    public int getUnits() {
        return units;
    }
}
