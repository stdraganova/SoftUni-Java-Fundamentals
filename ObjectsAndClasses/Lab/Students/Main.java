package ObjectsAndClasses.Lab.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Student>studentsList = new ArrayList<>();

        while (!command.contains("end")){
            String firstName = command.split(" ")[0];
            String lastName = command.split(" ")[1];
            int age = Integer.parseInt(command.split(" ")[2]);
            String homeTown = command.split(" ")[3];

            Student student = new Student(firstName, lastName, age, homeTown);
            studentsList.add(student);

            command = scanner.nextLine();
        }

        String town = scanner.nextLine();
        for (Student currentStudent : studentsList){
            if (town.equals(currentStudent.getHomeTown())){
                System.out.printf("%s %s is %d years old%n", currentStudent.getFirstName(), currentStudent.getLastName(), currentStudent.getAge());
            }
        }
    }
}
