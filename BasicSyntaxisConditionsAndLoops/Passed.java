package BasicSyntaxisConditionsAndLoops;

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float grade = Float.parseFloat(scanner.nextLine());

        if (grade >= 3){
            System.out.println("Passed!");
        }
    }
}
