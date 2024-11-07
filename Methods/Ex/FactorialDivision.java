package Methods.Ex;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        double result = factorial(firstNum) * 1.0 / factorial(secondNum);
        System.out.printf("%.2f", result);
    }
    public static long factorial(int number){
        long factorial = 1;
        for (int i = number; i >= 1; i--) {
          factorial = factorial * i;
        }
        return factorial;
    }
}
