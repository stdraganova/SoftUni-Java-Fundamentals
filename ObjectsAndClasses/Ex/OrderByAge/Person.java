package ObjectsAndClasses.Ex.OrderByAge;

public class Person {
    private String name;
    private int id;
    private int age;

    public Person(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        String text = String.format("%s with ID: %d is %d years old.",name, id, age);
        return text;
    }
}
