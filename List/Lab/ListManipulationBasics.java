package List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Чете лист от цели числа
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //Получаваме команди, докато не получим "end"
        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")){

            switch (command[0]) {
                //Команди:
                //Add {number} – add a number to the end of the list
                case "Add" -> numbers.add(Integer.parseInt(command[1]));
                //Remove {number} – remove a number from the list
                case "Remove" -> numbers.remove(Integer.valueOf(command[1]));
                //RemoveAt {index} – remove a number at a given index
                case "RemoveAt" -> numbers.remove(Integer.parseInt(command[1]));
                //Insert {number} {index} – insert a number at a given index
                //                                            index                     number
                case "Insert" -> numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
            }

            command = scanner.nextLine().split(" ");
        }
        //Принтираме крайния лист разделен със спейсове

        System.out.print(numbers.toString().replaceAll("[\\[\\],]" , ""));
    }
}
