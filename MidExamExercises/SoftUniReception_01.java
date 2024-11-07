package MidExamExercises;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Колко студента на час могат да обработят всеки един от служителите
        int firstEmployeeStudentsPerHour = Integer.parseInt(scanner.nextLine());
        int secondEmployeeStudentsPerHour = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeStudentsPerHour = Integer.parseInt(scanner.nextLine());
        //Броят студенти за обработка
        int studentsToHandle = Integer.parseInt(scanner.nextLine());

        //На всеки 4 часа служителите си взимат почивка за един час

        //На колко студента ОБЩО могат за 1ч. да отговорят служителите
        int sumStudentsPerHour = firstEmployeeStudentsPerHour + secondEmployeeStudentsPerHour + thirdEmployeeStudentsPerHour;
        int hoursToAnswer = 0;

        while (studentsToHandle > 0){
            hoursToAnswer++;

            if (hoursToAnswer % 4 == 0){
                continue;
            }else {
                studentsToHandle -= sumStudentsPerHour;
            }
        }

        System.out.printf("Time needed: %dh.", hoursToAnswer);
    }
}
