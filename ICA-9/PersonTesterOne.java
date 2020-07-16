// PersonTest.java
/*
	Developed By: Douglas Vinicio
	Script Date: July 14, 2020
*/
public class PersonTesterOne {

    public static void main(String[] args){

        /* Reference Variables */
        Person firstPerson, secondPerson;
        double heightDifference;

        /* Instances */
        firstPerson = new Person();
        secondPerson = new Person();

        /* Invoking set accessors to populate attributes */
        // First Person
        firstPerson.setName("John Doe");
        firstPerson.setAge(35);
        firstPerson.setEyeColor("Blue");
        firstPerson.setHairColor("Gray");
        firstPerson.setGender("Male");
        firstPerson.setHeight(5.8);
        // Second Person
        secondPerson.setName("Jane Doe");
        secondPerson.setAge(30);
        secondPerson.setEyeColor("Brown");
        secondPerson.setHairColor("Black");
        secondPerson.setGender("Female");
        secondPerson.setHeight(5.1);

        /* Formula */
        heightDifference = firstPerson.getHeight() - secondPerson.getHeight();

        /* Output Results */
        System.out.println("The name of the first person is " + firstPerson.getName());
        System.out.println("It's a " + firstPerson.getGender() + " and it's " + firstPerson.getAge() + " years old.");
        System.out.println("His eyes are " + firstPerson.getEyeColor() + " and the hair is " + firstPerson.getHairColor());
        System.out.println();
        System.out.println("The name of the second person is " + secondPerson.getName());
        System.out.println("It's a " + secondPerson.getGender() + " and it's " + secondPerson.getAge() + " years old.");
        System.out.println("Her eyes are " + secondPerson.getEyeColor() + " and the hair is " + secondPerson.getHairColor());
        System.out.println();
        System.out.printf(firstPerson.getName() + " is %.2f taller than " + secondPerson.getName() + "%n" , heightDifference );
    }
}
