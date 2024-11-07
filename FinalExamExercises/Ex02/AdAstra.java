package FinalExamExercises.Ex02;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(?<delimiter>[#\\|])(?<food>[A-Za-z ]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>\\d+)\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int totalCalories = 0;
        List<String> products = new ArrayList<>();

        while (matcher.find()) {
            String food = matcher.group("food");
            String date = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));

            totalCalories += calories;

            products.add(String.format("Item: %s, Best before: %s, Nutrition: %d", food, date, calories));
        }

        int daysToLast = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", daysToLast);

        for (String product : products) {
            System.out.println(product);
        }
    }
}
