package BasicSyntaxisConditionsAndLoops;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        while (num % 2 != 0){
            System.out.println("Please write an even number.");
            num = Integer.parseInt(scanner.nextLine());
        }
            System.out.println("The number is: " + Math.abs(num));
    }
}
