package DataTypesAndVariables.Ex;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballsN = Integer.parseInt(scanner.nextLine());
        long max = Long.MIN_VALUE;

        int snow = 0;
        int time = 0;
        int quality = 0;

        for (int i = 0; i < numberOfSnowballsN; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            if (snowballTime != 0) {
                long value = (long)Math.pow((double)snowballSnow / snowballTime, snowballQuality);

                if (value > max) {
                    max = value;
                    snow = snowballSnow;
                    time = snowballTime;
                    quality = snowballQuality;
                }
            }
        }

        System.out.printf("%d : %d = %d (%d)%n", snow, time, max, quality);
    }
}
