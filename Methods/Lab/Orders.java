package Methods.Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        totalPrice(item,quantity);

    }
    public static void totalPrice(String item, int quantity){

        double result = 0;

        switch (item) {
            case "coffee" -> result = 1.50 * quantity;
            case "water" -> result = 1.00 * quantity;
            case  "coke" -> result = 1.40 * quantity;
            case "snacks" -> result = 2.00 * quantity;
        }

        System.out.printf("%.2f", result);
    }
}
