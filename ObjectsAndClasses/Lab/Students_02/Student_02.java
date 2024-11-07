package ObjectsAndClasses.Lab.Students_02;

public class Student_02 {
    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    public Student_02(String firstName, String lastName, int age, String homeTown){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
}
