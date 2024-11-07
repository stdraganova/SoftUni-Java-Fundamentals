package Methods.Ex;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        topNum(number);
    }

    public static void topNum(int number){
        for (int i = 1; i <= number; i++) {
            int currentNum = i;
            int sumOfDigits = 0;
            int count = 0;

            while (currentNum > 0){
                int lastDigit = currentNum % 10;
                sumOfDigits += lastDigit;

                if (lastDigit % 2 > 0 ){
                    count++;
                }

                currentNum = currentNum / 10;
            }

            if ((sumOfDigits % 8 == 0) && (count >= 1)){
                System.out.println(i);
            }
        }
    }
}
