package BasicSyntaxisConditionsAndLoops;

import java.util.Scanner;

public class BackIn30Min {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int hourToMin = hour * 60;
        int totalMin = hourToMin + min;

        int afterThirtyMin = totalMin + 30;
        int finalHour = afterThirtyMin / 60;
        int finalMin = afterThirtyMin % 60;

        if (finalMin < 10 && finalHour < 24){
            System.out.printf("%d:%02d", finalHour, finalMin);
        } else if (finalMin >= 10 && finalHour < 24) {
            System.out.printf("%d:%d", finalHour, finalMin);
        } else if (finalMin < 10 && finalHour == 24){
            System.out.printf("0:%02d", finalMin);
        } else {
            System.out.printf("0:%d", finalMin);
        }


    }
}
