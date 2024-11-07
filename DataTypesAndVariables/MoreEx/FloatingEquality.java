package DataTypesAndVariables.MoreEx;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double eps = 0.000001;

        // Две десетични числа не могат да се сравнят за равност с ==,
        // затова се използва eps за сравняване с > или <

        double diff = Math.abs(firstNumber - secondNumber);

        if (eps > diff){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
