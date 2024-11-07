package List.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")){
           if (input[0].equals("Add")){
               int number = Integer.parseInt(input[1]);
               wagons.add(number);
           }else {
               int number = Integer.parseInt(input[0]);
               for (int i = 0; i < wagons.size(); i++) {
                   if (wagons.get(i) + number <= maxCapacity){
                       int peopleToFit = wagons.get(i) + number;
                       wagons.set(i, peopleToFit);
                       break;
                   }
               }
           }
           input = scanner.nextLine().split(" ");
        }
        System.out.print(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
