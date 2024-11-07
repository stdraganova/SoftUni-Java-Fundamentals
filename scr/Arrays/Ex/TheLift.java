package Arrays.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Програма, която намира място за туристи на лифт
        //Лифт с вагони -> масив с елементи
        //Макс. 4 човека на вагон -> макс. стойност за всеки елемент е 4.
        //Ако един вагон е пълен, препращаме хората към следващия свободен

        //Колко човека чакат лифта
        int waitingPeople = Integer.parseInt(scanner.nextLine());

        //Моментното състояние на лифта.(0 0 0 , 0 2 0, 4 4 4 ...)
        int[] lift = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        //Качваме хората по вагоните
        for (int i = 0; i < lift.length; i++) {
            int availableSpace =4 - lift[i];
            if (availableSpace > 0 && availableSpace <= waitingPeople){
                lift[i] += availableSpace;
                waitingPeople -= availableSpace;
            } else if (availableSpace > 0 && availableSpace > waitingPeople){
                lift[i] += waitingPeople;
                waitingPeople = 0;
            }
        }

        //няма повече чакащи, но на лифта има място
        if (waitingPeople == 0 && lift[lift.length -1] < 4){
            System.out.println("The lift has empty spots!");

        } else if (waitingPeople > 0) {
            //Лифта е пълен, но има още чакащи
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
        }

        //Принтираме лифта
        for (int i = 0; i < lift.length; i++) {
            System.out.print(lift[i] + " ");
        }
    }
}
