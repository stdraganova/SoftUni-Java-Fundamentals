package BasicSyntaxisConditionsAndLoops.Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int numValid = Integer.parseInt(num);
        int numInt = Integer.parseInt(num);
        int length = num.length();
        int lastDigit = 0;
        int sum = 0;


        while (length > 0){

            lastDigit = numInt % 10;
            int fact = 1;

            for (int i = 1; i <= lastDigit; lastDigit--){

                fact = fact * lastDigit;

            }

            sum += fact;
            numInt = numInt / 10;
            length--;
        }

        if (numValid == sum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
