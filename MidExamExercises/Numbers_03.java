package MidExamExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем масив от цели числа
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        // Намираме средната стойност
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double averageValue = sum * 1.0 / numbers.length;

        // Намираме всички елементи > от средната стойност
        int[] greaterElements = new int[numbers.length];
        int count = 0;
        for (int number : numbers) {
            if (number > averageValue) {
                greaterElements[count] = number;
                count++;
            }
        }

        // Ако няма елементи по-големи от средната стойност
        if (count == 0) {
            System.out.println("No");
            return;
        }

        // Създаваме нов масив с точния брой на елементите, по-големи от средната стойност
        int[] resultArray = Arrays.copyOf(greaterElements, count);

        // Сортираме масива в намаляващ ред
        Arrays.sort(resultArray);
        for (int i = 0; i < resultArray.length / 2; i++) {
            int temp = resultArray[i];
            resultArray[i] = resultArray[resultArray.length - 1 - i];
            resultArray[resultArray.length - 1 - i] = temp;
        }

        // Печатаме топ 5 елемента или по-малко, ако има по-малко от 5 елемента
        for (int i = 0; i < Math.min(5, resultArray.length); i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}
