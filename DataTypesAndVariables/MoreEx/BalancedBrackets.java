package DataTypesAndVariables.MoreEx;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int balance = 0;
        boolean isBalanced = true;

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                balance++;
            } else if (input.equals(")")) {
                balance--;
            }

            // Check for imbalance
            if (balance < 0) {
                isBalanced = false;
            }
        }

        // Final check for balance
        if (balance != 0) {
            isBalanced = false;
        }

        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
