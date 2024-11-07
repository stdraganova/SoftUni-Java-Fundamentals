package RegularExpressions.Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<furnitureName>\\w+)<<(?<price>([0-9]+)[.]?([0-9]+))!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();

        List<String> furnitureNames = new ArrayList<>();
        double totalPrice = 0;

        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String name = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitureNames.add(name);
                totalPrice += (price * quantity);
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furnitureNames.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
