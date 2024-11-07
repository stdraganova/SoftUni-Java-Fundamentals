package MidExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Получаваме поредица от елементи (всеки елемент ще има двойник)
        List<String> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        //До получаване на край, ще получаваме стринг от две цели числа(индекси) - разделени със спейс
        String[] command = scanner.nextLine().split(" ");

        int countMoves = 0;
        while (!command[0].equals("end")){
            countMoves++;
            int firstIndex = Integer.parseInt(command[0]);
            int secondIndex = Integer.parseInt(command[1]);

            if ((firstIndex < 0 || firstIndex > numbers.size()) || (secondIndex < 0 || secondIndex > numbers.size())){
                int addIndex = numbers.size() / 2;
                String element = "-" + countMoves + "a";
                numbers.add(addIndex,element );
                numbers.add(addIndex + 1, element);
                System.out.println("Invalid input! Adding additional elements to the board");
            }else if (numbers.get(firstIndex).equals(numbers.get(secondIndex))){
                String firstElement = numbers.get(firstIndex);
                String secondElement = numbers.get(secondIndex);
                numbers.remove(firstElement);
                numbers.remove(secondElement);

                System.out.printf("Congrats! You have found matching elements - %s!%n",firstElement);
            }else {
                System.out.println("Try again!");
            }

            if (numbers.size() <= 0){
                break;
            }
            command = scanner.nextLine().split(" ");
        }
        //Ако индексите са еднакви или са извън границите -> добавяме два еднакви елемента в средата на листа
        if (numbers.size() <= 0){
            System.out.printf("You have won in %d turns!%n", countMoves);
        }else {
            System.out.println("Sorry you lose :(");
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
