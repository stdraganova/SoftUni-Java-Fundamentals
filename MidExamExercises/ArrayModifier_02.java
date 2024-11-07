package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")){
            int firstIndex = 0;
            int secondIndex = 0;
            int currentElement = 0;

            switch (command[0]){
                case "swap" -> {
                    firstIndex = Integer.parseInt(command[1]);
                    secondIndex = Integer.parseInt(command[2]);
                    currentElement = numbers.get(firstIndex);
                    numbers.set(firstIndex, numbers.get(secondIndex));
                    numbers.set(secondIndex, currentElement);
                }
                case "multiply" -> {
                    firstIndex = Integer.parseInt(command[1]);
                    secondIndex = Integer.parseInt(command[2]);
                    currentElement = numbers.get(firstIndex) * numbers.get(secondIndex);
                    numbers.set(firstIndex, currentElement);
                }
                case "decrease" -> {
                    for (int i = 0; i < numbers.size(); i++) {
                        int number = numbers.get(i);
                        number--;
                        numbers.set(i, number);
                    }
                }
            }
            command = scanner.nextLine().split(" ");
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
    }
}
