package cubedemo;


public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double len, double w){
        this.length = len;
        this.width = w;
    }

    public void setLength(double len){
        length = len;
    }

    public void setWidth(double w){
        width = w;
    }

    public void set(double len, double w){
        length = len;
        width = w;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return this.length * this.width;
    }
}
