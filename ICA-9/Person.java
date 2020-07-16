/*
	Developed By: Douglas Vinicio
	Script Date: July 14, 2020
*/

/**
 * Return person name,age,eye color,hair color,height and gender.
 *
 * @author  Douglas Vinicio
 * @version 1.0
 * @since   2020-07-14
 * @return  person name,age,eye color,hair color,height and gender.
 */

public class Person {

    /* Attribute definitions */
    private String name;
    private String eyeColor;
    private String hairColor;
    private String gender;
    private int age;
    private double height;

    /* Declare setter methods */
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }
    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setHeight(double height){
        this.height = height;
    }

    /* Declaring getter methods */
    public String getName(){
        return this.name;
    }
    public String getEyeColor(){
        return this.eyeColor;
    }
    public String getHairColor(){
        return this.hairColor;
    }
    public String getGender(){
        return this.gender;
    }
    public int getAge(){
        return this.age;
    }
    public double getHeight(){
        return this.height;
    }
}


/*
ICA-1
--------
Two common attributes of a person are the person’s first name and last name.
The typical operations on a person’s name are to set the name and print the name.
You might add as many data members and method members as you need.
Create a Person class and PersonTesterOne class to test your design.
*/