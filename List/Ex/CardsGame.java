package List.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Четем две ръце карти (листа) с цели числа
        // Трябва да открием коя е печелившата ръка

        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        
        //Сравняваме двата листа. Играча с по-голямата карта взема и двете царти и ги слага най-отзад на своя лист.
        //{wining cart, losing cart}
        //Играчит с малка карта я маха от своя лист
        //Равенство: и двамата играчи трябва да премахнат своята карта от листовете си.
        // Играта свършва, когато единият играч остане без карти
        //Принтираме победителя и сумата от картите му
        
        boolean hasCards = true;
        
        while (hasCards){
            
            int size = firstHand.size();
            for (int i = 0; i < size; i++) {
                if (firstHand.get(i) > secondHand.get(i)){
                    int winnigCard = firstHand.get(i);
                    int loosingCard = secondHand.get(i);

                    firstHand.remove(i);
                    firstHand.add(winnigCard);
                    firstHand.add(loosingCard);
                    secondHand.remove(i);
                    i--;

                } else if (firstHand.get(i) < secondHand.get(i)) {
                    int winnigCard = secondHand.get(i);
                    int loosingCard = firstHand.get(i);

                    secondHand.remove(i);
                    secondHand.add(winnigCard);
                    secondHand.add(loosingCard);
                    firstHand.remove(i);
                    i--;

                } else {
                    firstHand.remove(i);
                    secondHand.remove(i);
                    i--;
                }
                if (firstHand.isEmpty() || secondHand.isEmpty()){
                    hasCards = false;
                    break;
                }
            }
        }

        int sum = 0;

        if (firstHand.size() > secondHand.size()){
            for (int number : firstHand) {
                sum += number;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }else {
            for (int number : secondHand) {
                sum +=number;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
