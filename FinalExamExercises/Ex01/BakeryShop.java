package FinalExamExercises.Ex01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BakeryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> foodsAll = new LinkedHashMap<>();
        String input = scanner.nextLine();

        int soldCount = 0;

        while (!input.equals("Complete")){
            String food = input.split(" ")[2];
            int quantity = Integer.parseInt(input.split(" ")[1]);
            String command = input.split(" ")[0];

            switch (command){
                case "Receive" -> {
                    foodsAll.putIfAbsent(food, 0);
                    if (quantity > 0){
                        foodsAll.put(food, quantity);
                    }
                }
                case "Sell" -> {
                    if (!foodsAll.containsKey(food)){
                        System.out.printf("You do not have any %s.%n", food);
                    }else {
                        int currentQuantity = foodsAll.get(food);
                        if (quantity > currentQuantity){
                            System.out.printf("There aren't enough %s. You sold the last %d of them.%n", food, currentQuantity);
                            foodsAll.remove(food);
                            soldCount += currentQuantity;
                        }else {
                            System.out.printf("You sold %d %s.%n", quantity, food);
                            soldCount += quantity;
                            currentQuantity -= quantity;

                            if (currentQuantity == 0){
                                foodsAll.remove(food);
                            }else {
                                foodsAll.put(food, currentQuantity);
                            }
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        foodsAll.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        System.out.printf("All sold: %d goods", soldCount);
    }
}
