package List.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на първоначалния списък със стрингове
        List<String> data = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));

        // Обработка на командите
        String input;
        while (!(input = scanner.nextLine()).equals("3:1")) {
            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            switch (command) {
                case "merge":
                    //понеже даденият индекс може да бъде по-малък или по-голям от началото и края на на масива
                    //затова проверяваме дали даденият индекс излиза от граници с Mat.max|Math.min
                    int startIndex = Math.max(0, Integer.parseInt(commandParts[1]));
                    int endIndex = Math.min(data.size() - 1, Integer.parseInt(commandParts[2]));
                    //Викаме метода за обединяване
                    if (startIndex <= endIndex) {
                        merge(data, startIndex, endIndex);
                    }
                        break;
                case "divide":
                    //Създаваме две променливи
                    //Индекса, от който ще вземем елемента
                    int index = Integer.parseInt(commandParts[1]);
                    //Броят на частите, на които ще бъде разделен
                    int partitions = Integer.parseInt(commandParts[2]);
                    if (partitions > 0) {
                        divide(data, index, partitions);
                    }
                    break;
            }
        }

        // Отпечатване на резултата
        System.out.println(String.join(" ", data));
    }

    private static void merge(List<String> data, int startIndex, int endIndex) {
        String merged = "";
        //Обединяваме елементите от от стартов индекс до краен индекс в стринг
        for (int i = startIndex; i <= endIndex; i++) {
            merged += data.get(i);
        }
        //Премахваме обединените елементи от листа
        for (int i = endIndex; i >= startIndex; i--) {
            data.remove(i);
        }
        //Добавяме стринга на обединените елементи към листа на стартовия индекс
        data.add(startIndex, merged);
    }

    private static void divide(List<String> data, int index, int partitions) {
        //Елемента, които ще делим
        String element = data.get(index);
        //Премахваме елемента от листа
        data.remove(index);
        int partSize = element.length() / partitions;//Дължината на всяка една от частите
        int start = 0;

        //Обхождаме разделените части на елемента от 1вата до броя на желаните части - 1
        for (int i = 1; i < partitions; i++) {
            //substring(startIndex, endIndex) - взема субстринг от остовния стринг в даден диапазон
            data.add(index, element.substring(start, start + partSize));
            index++; //Понеже искаме другият разделен елемент да сложим на следващия индекс.
            start += partSize; //Това е началото на следващия субстринг
        }
        //Ако дължината на стринга е нечетна, тябва да достъпим последния елемент
        //Даваме само начален индекс старт и то ще продължи до края на стринга.
        data.add(index,element.substring(start));
    }
}
