package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            int control = i;
            int sum = 0;

            while (control > 0) {
                sum += control % 10;
                control = control / 10;
            }

            boolean flag = (sum == 5) || (sum == 7) || (sum == 11);

            if (flag){
                System.out.printf("%d -> True%n", i);
            }else {
                System.out.printf("%d -> False%n", i);
            }

            sum = 0;
        }
    }
}
