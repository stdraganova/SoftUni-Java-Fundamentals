package FinalExamExercises.Ex03;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantRating = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String[] plantInfo = scanner.nextLine().split("<->");
            String plant = plantInfo[0];
            int rarity = Integer.parseInt(plantInfo[1]);
            plantRarity.put(plant, rarity);
            plantRating.put(plant, new ArrayList<>()); // Initialize the rating list for each plant
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {
            String[] command = input.split(": ");
            String plant = (command[1].split(" - "))[0];

            if (!plantRarity.containsKey(plant)) {
                System.out.println("error");
                input = scanner.nextLine();
                continue;
            }

            switch (command[0]) {
                case "Rate" -> {
                    double rating = Double.parseDouble((command[1].split(" - "))[1]);
                    plantRating.get(plant).add(rating);
                }
                case "Update" -> {
                    int newRarity = Integer.parseInt((command[1].split(" - "))[1]);
                    plantRarity.put(plant, newRarity);
                }
                case "Reset" -> {
                    plantRating.get(plant).clear(); // Clear the ratings list for the plant
                }
                default -> {
                    System.out.println("error");
                }
            }
            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantRarity.entrySet()) {
            String plant = entry.getKey();
            int rarity = entry.getValue();
            double averageRating = plantRating.get(plant).stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plant, rarity, averageRating);
        }
    }
}
