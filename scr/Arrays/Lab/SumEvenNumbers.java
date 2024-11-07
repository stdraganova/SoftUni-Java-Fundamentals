package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четем масив от конзолата
        String string = scanner.nextLine();
        String[] toArr = string.split(" ");
        int[] arr = Arrays.stream(toArr).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            //Сумираме елементите на масива
            if (arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
        }
        //Принтираме резултата
        System.out.println(sum);
    }
}
