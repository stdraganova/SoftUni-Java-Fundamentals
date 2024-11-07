package ObjectsAndClasses.Lab.Students_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Student_02>studentsList = new ArrayList<>();

        while (!command.contains("end")){
            String firstName = command.split(" ")[0];
            String lastName = command.split(" ")[1];
            int age = Integer.parseInt(command.split(" ")[2]);
            String homeTown = command.split(" ")[3];

            Student_02 currentStudent = getExistingStudent(studentsList, firstName, lastName);
            if (currentStudent != null){
                currentStudent.setAge(age);
                currentStudent.setHomeTown(homeTown);
            }else{
                currentStudent = new Student_02(firstName, lastName, age, homeTown);
                studentsList.add(currentStudent);
            }

            command = scanner.nextLine();
        }

        String town = scanner.nextLine();
        for (Student_02 currentStudent : studentsList){
            if (town.equals(currentStudent.getHomeTown())){
                System.out.printf("%s %s is %d years old%n", currentStudent.getFirstName(), currentStudent.getLastName(), currentStudent.getAge());
            }
        }
    }

    private static Student_02 getExistingStudent(List<Student_02> studentsList, String firstName, String lastName) {
        for (Student_02 student : studentsList){
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return student;
            }
        }
        return null;
    }
}
