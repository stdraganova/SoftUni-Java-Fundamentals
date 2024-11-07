package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // special if sum = 5, 7 or 11;

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            int control = i;
            int sum = 0;

            while (control > 0){
                int lastDigit = control % 10;
                sum += lastDigit;
                control /= 10;
            }

            boolean flag = sum == 5 || sum == 7 || sum == 11;

            if (flag){
                System.out.printf("%d -> True%n", i );
            } else{
                System.out.printf("%d -> False%n", i );
            }

            sum = 0;
        }
    }
}
