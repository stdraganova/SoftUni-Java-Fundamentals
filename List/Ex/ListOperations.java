package List.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четем лист от цели числа
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //До получаване на край, получаваме операции, които да изпълним на листа
        String[] operation = scanner.nextLine().split(" ");
        //Операции:
        //Add {number} - add number at the end
        //Insert {number} {index} - insert number at given index
        //Remove {index} - remove that index
        //Shift left {count} - first number becomes last 'count' times
        //Shift right {count} - last number becomes first 'count' times

        while (!operation[0].equals("End")){

            switch (operation[0]){
                case "Add" -> numbers.add(Integer.parseInt(operation[1]));
                case "Insert" ->{
                    int number = Integer.parseInt(operation[1]);
                    int index = Integer.parseInt(operation[2]);

                    if (index >= 0 && index <= numbers.size() - 1){
                        numbers.add(index,number);
                    }else {
                        System.out.println("Invalid index");
                    }
                }
                case "Remove" -> {
                    int index = Integer.parseInt(operation[1]);
                    if (index >= 0 && index <= numbers.size() - 1){
                        numbers.remove(index);
                    }else {
                        System.out.println("Invalid index");
                    }
                }
                case "Shift" ->{
                    int count = Integer.parseInt(operation[2]);
                    for (int i = 0; i < count; i++) {
                        if (operation[1].equals("left")){
                            int firstNum = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(Integer.valueOf(firstNum));
                        }else {
                            int lastNum = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, lastNum);
                        }
                    }
                }
            }

            operation = scanner.nextLine().split(" ");
        }
        System.out.print(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
