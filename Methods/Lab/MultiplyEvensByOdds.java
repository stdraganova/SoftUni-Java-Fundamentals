package Methods.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleOfEvensAndOdds(number));
    }
    public static int getMultipleOfEvensAndOdds(int number){
       int result = evenSum(number) * oddSum(number);
       return result;
    }

    public static int evenSum(int number){

        if (number < 0){
            number = number * (-1);
        }

        int sum = 0;

        while (number > 0){
           int lastDigit = number % 10;

           if (lastDigit % 2 == 0){
               sum += lastDigit;
           }

           number = number / 10;
        }

       return sum;
    }

    public static int oddSum(int number){

        if (number < 0){
            number = number * (-1);
        }

        int sum = 0;

        while (number > 0){
            int lastDigit = number % 10;

            if (lastDigit % 2 != 0){
                sum += lastDigit;
            }

            number = number / 10;
        }

        return sum;
    }
}
