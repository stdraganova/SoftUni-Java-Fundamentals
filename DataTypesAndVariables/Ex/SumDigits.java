package DataTypesAndVariables.Ex;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int length  = input.length();
        int number = Integer.parseInt(input);
        int digit = 0;
        int sum = 0;

        for (int i = 0; i < length; i++){
            digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        System.out.println(sum);
    }
}
