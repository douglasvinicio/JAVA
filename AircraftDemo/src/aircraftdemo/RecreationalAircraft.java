package aircraftdemo;

public class RecreationalAircraft extends Aircraft {

    private int maxNumberPassengers;

    public RecreationalAircraft(String aircraftName, String yearBuilt, int maxNumPass) {
        super(aircraftName, yearBuilt);
        this.maxNumberPassengers = maxNumPass;
    }

    @Override
    public void setAircraftName(String aircraftName) {
        super.setAircraftName(aircraftName);
    }

    public void setMaxNumberPassengers(int maxNumPass) {
        this.maxNumberPassengers = maxNumPass;
    }

    @Override
    public int getMaxNumberPassengers() {
        return maxNumberPassengers;
    }

    @Override
    public String toString() {
        String str = "---------------\nAircraft Info"
                + "\nName: " + getAircraftName()
                + "\nMaximum number of passengers: " + maxNumberPassengers;
        return str;
    }
}
