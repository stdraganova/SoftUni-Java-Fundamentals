package List.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");
        int bombNum = Integer.parseInt(command[0]);
        int power = Integer.parseInt(command[1]);

        while (numbers.contains(bombNum)) {
            int bombPosition = numbers.indexOf(bombNum);
            int startPosition = Math.max(0, bombPosition - power);
            int endPosition = Math.min(numbers.size() - 1, bombPosition + power);

            for (int position = endPosition; position >= startPosition; position--) { //Така избягваме проблема с намаляващия индекс
                numbers.remove(position);
            }
        }

        int sum = 0;
        for (int number : numbers) {
           sum += number;
        }
        System.out.println(sum);
    }
}
