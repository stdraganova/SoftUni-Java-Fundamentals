package AssociativeArrays.Ex;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfStudents ; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(student,new ArrayList<>());

            List<Double> getList = students.get(student);
            getList.add(grade);
            students.put(student, getList);
        }

        for (Map.Entry<String, List<Double>> entry : students.entrySet()){
            String student = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);

            if (averageGrade >= 4.50){
                System.out.printf("%s -> %.2f%n", student, averageGrade);
            }
        }
    }

    public static double getAverageGrade (List<Double> grades){

        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }
}
