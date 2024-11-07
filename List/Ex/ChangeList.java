package List.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четем лист от цели числа
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //Четем команда, докато не получим край
        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")){
            switch (command[0]){
                //Команди:
                //Delete {element} - delete all elements in the array which are equal to the given element
                case "Delete" -> {
                    int element = Integer.parseInt(command[1]);
                    for (int i = 0; i < numbers.size(); i++){
                        if (element == numbers.get(i)){
                            numbers.remove(Integer.valueOf(element));
                            i--;
                        }
                    }
                }
                //Insert {element} {position} - insert element at the given position
                case "Insert" ->{
                    int element = Integer.parseInt(command[1]);
                    int position = Integer.parseInt(command[2]);
                    numbers.add(position,element);
                }
            }
            command = scanner.nextLine().split(" ");
        }
        System.out.print(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
