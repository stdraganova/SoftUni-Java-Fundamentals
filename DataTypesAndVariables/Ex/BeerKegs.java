package DataTypesAndVariables.Ex;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double volume = 0;
        double max = Double.MIN_VALUE;
        String maxKeg = " ";

        for (int i = 0; i < n; i++){
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            volume = Math.PI * (Math.pow(radius,2)) * height;

            if (volume > max){
                max = volume;
                maxKeg = model;
            }
        }

        System.out.println(maxKeg);

    }
}
