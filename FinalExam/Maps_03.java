package FinalExam;

import java.util.*;

public class Maps_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> plantsWatter = new LinkedHashMap<>();
        Map<String, List<String>> sections = new LinkedHashMap<>();

        String[] commandInfo = scanner.nextLine().split(": ");

        while (!commandInfo[0].equals("EndDay")) {
            String[] plantInfo = commandInfo[1].split("-");
            String plantName = plantInfo[0];
            List<String> plantsInfo;
            List<String> plantsList;

            switch (commandInfo[0]) {
                case "Plant":
                    int waterNeeded = Integer.parseInt(plantInfo[1]);
                    String section = plantInfo[2];

                    if (!plantsWatter.containsKey(plantName)) {
                        plantsInfo = new ArrayList<>(Arrays.asList(String.valueOf(waterNeeded), section));
                        plantsWatter.put(plantName, plantsInfo);

                        plantsList = sections.getOrDefault(section, new ArrayList<>());
                        plantsList.add(plantName);
                        sections.put(section, plantsList);
                    } else {
                        plantsInfo = plantsWatter.get(plantName);
                        int currentWaterNeeded = Integer.parseInt(plantsInfo.get(0));
                        plantsInfo.set(0, String.valueOf(currentWaterNeeded + waterNeeded));
                        plantsWatter.put(plantName, plantsInfo);
                    }
                    break;

                case "Water":
                    if (!plantsWatter.containsKey(plantName)) {
                        break;
                    }
                    int waterAmount = Integer.parseInt(plantInfo[1]);
                    plantsInfo = plantsWatter.get(plantName);
                    int waterNeededLeft = Integer.parseInt(plantsInfo.get(0)) - waterAmount;
                    plantsInfo.set(0, String.valueOf(waterNeededLeft));

                    if (waterNeededLeft <= 0) {
                        plantsWatter.remove(plantName);
                        String plantSector = plantsInfo.get(1);
                        plantsList = sections.get(plantSector);
                        plantsList.remove(plantName);
                        if (plantsList.isEmpty()) {
                            sections.remove(plantSector);
                        } else {
                            sections.put(plantSector, plantsList);
                        }
                        System.out.printf("%s has been sufficiently watered.%n", plantName);
                    } else {
                        plantsWatter.put(plantName, plantsInfo);
                    }
                    break;
            }
            commandInfo = scanner.nextLine().split(": ");
        }

        System.out.println("Plants needing water:");
        for (Map.Entry<String, List<String>> entry : plantsWatter.entrySet()) {
            String plantName = entry.getKey();
            String water = entry.getValue().get(0);
            System.out.printf("%s -> %sml left%n", plantName, water);
        }

        System.out.println("Sections with thirsty plants:");
        for (Map.Entry<String, List<String>> entry : sections.entrySet()) {
            String sectionName = entry.getKey();
            List<String> plants = entry.getValue();
            int count = plants.size();
            System.out.printf("%s: %d%n", sectionName, count);
        }
    }
}
