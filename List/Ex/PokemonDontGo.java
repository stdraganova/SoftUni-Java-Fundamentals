package List.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Получаваме поредица(лист) от числа, разделени с интервал
        List<Integer> distance = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        while (distance.size() > 0){
            int index = Integer.parseInt(scanner.nextLine());
            int removedElement = 0;

            if (index < 0){
                removedElement = distance.get(0);
                sum += removedElement;
                int lastElement = distance.get(distance.size() - 1);
                distance.remove(0);
                distance.add(0,lastElement);

            } else if (index > distance.size() - 1) {
                removedElement = distance.get(distance.size() - 1);
                sum += removedElement;
                int firstElement = distance.get(0);
                distance.remove(distance.size() - 1);
                distance.add(firstElement);
            }else {
                removedElement = distance.get(index);
                distance.remove(index);
                sum += removedElement;
            }

            for (int possition = 0; possition < distance.size(); possition++) {
                int currentElement = distance.get(possition);
                if (removedElement >= currentElement){
                    currentElement += removedElement;
                    distance.set(possition,currentElement);
                }else {
                    currentElement -= removedElement;
                    distance.set(possition,currentElement);
                }
            }
        }
        System.out.println(sum);
    }
}
