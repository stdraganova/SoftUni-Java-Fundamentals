package DataTypesAndVariables.Ex;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int quantitiesWatter = Integer.parseInt(scanner.nextLine());

           if (capacity >= quantitiesWatter){
               capacity -= quantitiesWatter;
               sum += quantitiesWatter;
            }else {
                System.out.println("Insufficient capacity!");
            }

            if (i == n - 1){
                System.out.println(sum);
            }
        }
        scanner.close();
    }
}
