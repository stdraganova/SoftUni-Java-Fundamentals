package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Четем инт масив от един ред
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        //Може да се напище и така:
        //.mapToInt(e -> Integer.parseInt(e))

        //Сумата на четните числа
        int sumEven = 0;
        //Сумата на нечетните числа
        int sumOod = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0){
                sumEven += numbers[i];
            }else {
                sumOod += numbers[i];
            }
        }
        //Разликата между двете суми
        int diff = sumEven - sumOod;
        System.out.println(diff);
    }
}
