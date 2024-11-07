package List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Четем лист
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //Четем команди
        String[] command = scanner.nextLine().split(" ");
        //До получаване на край, четем команди
        while (!command[0].equals("end")){

            int number = 0;
            switch (command[0]){
                case "Contains":
                    number = Integer.parseInt(command[1]);
                    if (numbers.contains(number)){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (command[1].equals("even")){
                        for (int i = 0; i < numbers.size(); i++) {
                            int currentNum = numbers.get(i);
                            if (currentNum % 2 == 0){
                                System.out.print(currentNum + " ");
                            }
                        }
                    } else if (command[1].equals("odd")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            int currentNum = numbers.get(i);
                            if (currentNum % 2 != 0){
                                System.out.print(currentNum + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbers.size() ; i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    number = Integer.parseInt(command[2]);
                    String symbol = command[1];
                    for (int i = 0; i < numbers.size(); i++) {
                        switch (symbol){
                            case "<" -> {
                                if (numbers.get(i) < number){
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            case ">" -> {
                                if (numbers.get(i) > number){
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            case ">=" ->{
                                if (numbers.get(i) >= number){
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            case "<=" -> {
                                if (numbers.get(i) <= number){
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                        }
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine().split(" ");
        }
    }
}
