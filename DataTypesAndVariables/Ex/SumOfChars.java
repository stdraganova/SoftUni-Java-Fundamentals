package DataTypesAndVariables.Ex;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char ch = ' ';
        int value = 0;
        int sum = 0;

        if (n == 0){
            System.out.print("The sum equals: 0");
        }else {
        for (int i = 0; i < n; i++){
            String letter = scanner.nextLine();

            ch = letter.charAt(0);
            value = (int) ch;
            sum += value;
        }

        System.out.printf("The sum equals: %d%n", sum);

        }
    }
}
