package aircraftdemo;

public class CargoAircraft extends Aircraft {

    private int cargoCapacity;

    public CargoAircraft(String aircraftName, String yearBuilt, int cargoCap) {
        super(aircraftName, yearBuilt);
        this.cargoCapacity = cargoCap;
    }

    @Override
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public String toString() {
        String str = "---------------\nAircraft Info"
                + "\nName: " + getAircraftName()
                + "\nCargo Capacity: " + cargoCapacity;
        return str;
    }
}
