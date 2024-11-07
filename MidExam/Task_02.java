package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("Finish")){
            int value = Integer.parseInt(command[1]);
            switch (command[0]){
                case "Add" -> {numbers.add(value);}
                case "Remove" -> {numbers.remove(Integer.valueOf(value));}
                case "Replace" -> {
                    int replacement = Integer.parseInt(command[2]);
                    if (numbers.contains(value)){
                        int index = numbers.indexOf(value);
                        numbers.set(index,replacement);
                    }
                }
                case "Collapse" -> {
                    for (int i = numbers.size() - 1; i >= 0; i--) {
                        if (numbers.get(i) < value){
                            numbers.remove(i);
                        }
                    }
                }
            }
            command = scanner.nextLine().split(" ");
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
