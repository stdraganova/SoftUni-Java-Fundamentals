package AssociativeArrays.Ex;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(" : ");
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!command[0].equals("end")){
            String courseName = command[0];
            String student = command[1];

            courses.putIfAbsent(courseName, new ArrayList<>());
            courses.get(courseName).add(student);

            command = scanner.nextLine().split(" : ");
        }

        courses.entrySet().forEach(entry ->{
            //Принтираме курсовете и броя на студентите
            System.out.println(entry.getKey() + ": " + entry.getValue().size());

            // Принтираме листа със студентите един по един
            entry.getValue().forEach(student -> {
                System.out.printf("-- %s%n", student);
            });
        });
    }
}
