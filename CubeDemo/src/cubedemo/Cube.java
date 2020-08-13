package cubedemo;

public class Cube extends Rectangle {

    private double height;

    public Cube(double len, double w, double h) {

        //Invoking the constructor from superclass. Builds a new object
        super(len, w);
        this.height = h;
    }

    //Getter for height
    public double getHeight() {
        return height;
    }

    //Calculating the surface of the cube multiplying by 6 the area
    public double getSurfaceArea() {
        return getArea() * 6;
    }

    public double getVolume() {
        return getArea() * this.height;
    }
}
