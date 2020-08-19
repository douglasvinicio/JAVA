package aircraftdemo;

public class Aircraft {

    private String aircraftName;
    private String yearBuilt;
    private int cargoCapacity;
    private int maxNumPass;

    public Aircraft(String aircraftName, String yearBuilt) {
        this.aircraftName = aircraftName;
        this.yearBuilt = yearBuilt;
    }

    //Setters and Getters
    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setMaxNumberPassengers(int maxNumPass) {
        this.maxNumPass = maxNumPass;
    }

    public int getMaxNumberPassengers() {
        return maxNumPass;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public String toString() {
        String str = "------------------\n"
                + "Aircraft Info \n"
                + "Name : " + aircraftName + "\n"
                + "Year Built : " + yearBuilt;

        return str;
    }

}
