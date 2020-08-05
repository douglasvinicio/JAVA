public class Pet {

    private String name;
    private String type;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public int getAge(){
        return this.age;
    }
}
