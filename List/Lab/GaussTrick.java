package List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> newNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size()/2; i++) {

                int sum = numbers.get(i) + numbers.get(numbers.size() - 1 - i);
                newNumbers.add(sum);

        }

        if (numbers.size() % 2 != 0){
            newNumbers.add(numbers.get(numbers.size() / 2));
        }

        System.out.print(newNumbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
