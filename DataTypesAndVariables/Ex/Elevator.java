package DataTypesAndVariables.Ex;

import java.util.Map;
import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int personsNumber = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double coursesNumber = Math.ceil(1.00 * personsNumber/capacity);
        System.out.printf("%.0f", coursesNumber);
    }
}
