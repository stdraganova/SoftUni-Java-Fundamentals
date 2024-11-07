package ObjectsAndClasses.Ex.Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());
        List<Student>studentsList = new ArrayList<>();

        for (int i = 1; i <= studentsCount ; i++) {
            String[] studentInfo = scanner.nextLine().split(" ");
            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            double grade = Double.parseDouble(studentInfo[2]);

            Student student = new Student(firstName, lastName, grade);
            studentsList.add(student);
        }

        //Sorting in descending order
        Collections.sort(studentsList, Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentsList){
            System.out.println(student);
        }
    }
}
