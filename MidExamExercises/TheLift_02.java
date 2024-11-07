package MidExamExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Програма която намира място за туристи на лифт
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        //Всеки вагон събира макс. 4 човека
        int maxCapacity = 4;
        //Ако вагона е пълен, трябва да препратим хората към следващия свободен
        int currentWagon;
        for (int wagons = 0; wagons < lift.length; wagons++) {
            //Проверяваме дали вагонът е пълен
            if (lift[wagons] == 4){
                continue;
            }
            //Проверяваме колко свободни места има на вагона
            int freeSpace = maxCapacity - lift[wagons];

            if (numberOfPeople >= freeSpace){
                lift[wagons] = lift[wagons] + freeSpace;
            }else {
                freeSpace = numberOfPeople;
                lift[wagons] = lift[wagons] + freeSpace;
            }
            numberOfPeople -= freeSpace;

            if (numberOfPeople == 0){
                break;
            }
        }

        if (numberOfPeople == 0 && emptySpaces(lift,maxCapacity)){
            System.out.println("The lift has empty spots!");

        } else if (numberOfPeople != 0 && !emptySpaces(lift,maxCapacity)) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", numberOfPeople);
        }

        for (int wagon : lift) {
            System.out.print(wagon + " ");
        }

    }
    public static boolean emptySpaces(int[] lift, int maxCapacity){
        boolean emptySpaces = false;
        for (int wagon = 0; wagon < lift.length; wagon++) {
            if (lift[wagon] < maxCapacity){
                emptySpaces = true;
                break;
            }
        }
        return emptySpaces;
    }
}
