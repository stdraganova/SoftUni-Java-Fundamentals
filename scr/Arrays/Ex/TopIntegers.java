package Arrays.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Въвеждаме масив от цели числа
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        //Сравняваме всеки елемент с тези след него да видим дали е най голям

        for (int i = 0; i < numbers.length; i++) {

            int currentNumber = numbers[i];
            boolean isBigger = true;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]){
                    isBigger = false;
                    break;
                }
            }

            if (isBigger){
                System.out.print(currentNumber + " ");
            }
        }
    }
}
