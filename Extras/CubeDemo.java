import java.util.Scanner;

public class CubeDemo {

    public static void main(String[] args) {

        double length, width, height;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the following dimensions of a cube: ");
        System.out.println("Length: ");
        length = input.nextDouble();
        System.out.println("Width: ");
        width = input.nextDouble();
        System.out.println("Height: ");
        height = input.nextDouble();

        Cube myCube = new Cube(length,width,height);

        System.out.println("");
        System.out.println("Here are the properties of the cube.");
        System.out.println("Length: " + myCube.getLength());
        System.out.println("Width: " + myCube.getWidth());
        System.out.println("Height: " + myCube.getHeight());
        System.out.println("Base area: " + myCube.getArea());
        System.out.println("Surface area: " + myCube.getSurfaceArea());
        System.out.println("Volume: " + myCube.getVolume());
    }
}
