package ObjectsAndClasses.Ex.OpinionPoll;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        String text = String.format("%s - %d", name, age);
        return text;
    }
}
