package AssociativeArrays.Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(" ");
        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();


        while (!input[0].equals("buy")){
            String product = input[0];
            double price = Double.parseDouble(input[1]);
            int quantity = Integer.parseInt(input[2]);

            productPrice.put(product, price);

            productQuantity.putIfAbsent(product, 0);
            productQuantity.put(product, productQuantity.get(product) + quantity);

            input = scanner.nextLine().split(" ");
        }

        for (Map.Entry<String, Double> entry : productPrice.entrySet()){
           String product = entry.getKey();
           double price = entry.getValue();
           int quantity = productQuantity.get(product);

           double totalPrice = quantity * price;

            System.out.printf("%s -> %.2f%n",product, totalPrice);
        }
    }
}
