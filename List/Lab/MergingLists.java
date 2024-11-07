package List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();

        int firstSize = firstList.size();
        int secondSize = secondList.size();
        int minSize = Math.min(firstSize,secondSize);
        int maxSize = Math.max(firstSize, secondSize);

        for (int i = 0; i < minSize; i++) {
            result.add(firstList.get(i));
            result.add(secondList.get(i));
        }

        for (int i = minSize; i < maxSize; i++) {
            if (firstSize > secondSize){
                result.add(firstList.get(i));
            }else {
                result.add(secondList.get(i));
            }
        }

        System.out.print(result.toString().replaceAll("[\\[\\],]", ""));
    }
}
