package DataTypesAndVariables.MoreEx;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner chetec = new Scanner(System.in);

        int number = Integer.parseInt(chetec.nextLine());

        for (int range = 2; range <= number; range++) {

            boolean isPrime = true;

            for (int divisor = 2; divisor < range; divisor++) {

                if (range % divisor == 0) {

                    isPrime = false;

                    break;

                }

            }

            System.out.printf("%d -> %b%n", range, isPrime);

        }
    }
}
