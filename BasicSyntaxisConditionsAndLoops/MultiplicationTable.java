package BasicSyntaxisConditionsAndLoops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int times = 1;

        while (times <= 10){
            int sum = num * times;

            System.out.printf("%d X %d = %d%n", num, times, sum);

            times++;
        }
    }
}
