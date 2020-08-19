package aircraftdemo;

public class AircraftDemo {

    public static void main(String[] args) {

        Aircraft[] aircrafts = new Aircraft[3];

        aircrafts[0] = new Aircraft("Cessna 172", "1999");
        aircrafts[1] = new RecreationalAircraft("Cessna 152", "2012", 6);
        aircrafts[2] = new CargoAircraft("Antonov An-225", "2000", 500);

        //Using setters to change objects data
        aircrafts[0].setAircraftName("Cessna 206");
        aircrafts[1].setMaxNumberPassengers(10);
        aircrafts[2].setCargoCapacity(1000);

        //Loop step through each item of the array and call the toString method
        for (int i = 0; i < aircrafts.length; i++) {
            System.out.println(aircrafts[i]);
        }
    }
}
