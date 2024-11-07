package BasicSyntaxisConditionsAndLoops.Exercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        boolean bool = true;

        while (bool){

            for (int i = 1; i <= ordersCount; i++){
                double price = 0;
                double pricePerCapsule = Double.parseDouble(scanner.nextLine());
                int days = Integer.parseInt(scanner.nextLine());
                int capsuleCount = Integer.parseInt(scanner.nextLine());

                price = pricePerCapsule * days * capsuleCount;
                totalPrice += price;

                System.out.printf("The price for the coffee is: $%.2f%n", price);
            }

            System.out.printf("Total: $%.2f", totalPrice);
            bool = false;
        }
    }
}
