package DataTypesAndVariables.Ex;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYield = Integer.parseInt(scanner.nextLine());
        int control = startYield;
        int sum = 0;
        int countDays = 0;

        while (control >= 100){
                sum += control - 26;;
                countDays++;
                control -= 10;
        }

        if (startYield < 100){
            System.out.println("0");
            System.out.println("0");
        }else {
            sum -= 26;
            System.out.println(countDays);
            System.out.println(sum);
        }
    }
}
