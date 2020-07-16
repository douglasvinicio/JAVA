
/*
ICA-2
--------
Suppose you have a Province class that contains name, population, and area.
Answer the following questions.

a. What is the name of the class?
Answer : Province

b. What are the instance variables?
Answer :
1. private String name;
2. private int  population;
3. private double area;

c. What are the methods?
Answer:
setName, setPopulation, setArea, getName, getPopulation, getArea

d. What are the private members?
The instance variables.

e. What are the public members?
The setters and getters methods.

*/

public class Province {

    //Instance Variables
    private String name;
    private int population;
    private double area;

    /* Setter Methods */
    public void setName(String name){
        this.name = name;
    }
    public void setPopulation(int population){
        this.population = population;
    }
    public void setArea(double area){
        this.area = area;
    }
    /* Getter Methods */
    public String getName(){
        return this.name;
    }
    public int getPopulation(){
        return this.population;
    }
    public double getArea(){
        return this.area;
    }
}