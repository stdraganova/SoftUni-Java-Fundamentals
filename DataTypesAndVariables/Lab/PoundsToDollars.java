package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double  britishPounds = Double.parseDouble(scanner.nextLine());
        double dollars = britishPounds * 1.36;
        System.out.printf("%.3f", dollars);
    }
}
