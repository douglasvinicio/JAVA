public class Person implements displayable {

    private String name;

    public Person (String n){
        this.name = n;
    }


    //Interface method being overriden /
    // It has to be invoked with the same signature and return type
    @Override
    public void display(){
        System.out.println("The name is: " + name);
    }


}
