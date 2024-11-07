package AssociativeArrays.Ex;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> materials = new HashMap<>();
        Map<String,Integer> junk = new LinkedHashMap<>();
        boolean isNotEnded = true;

        while (isNotEnded){
            String[] input = scanner.nextLine().split(" ");

            for (int i = 0; i < input.length ; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                if (material.equals("motes") || material.equals("fragments") || material.equals("shards")){
                    materials.putIfAbsent(material,0);
                    materials.put(material, materials.get(material) + quantity);

                    if (materials.get(material) >= 250){
                        materials.put(material, materials.get(material) - 250);

                        switch (material) {
                            case "motes" -> System.out.println("Dragonwrath obtained!");

                            case "fragments" -> System.out.println("Valanyr obtained!");

                            case "shards" -> System.out.println("Shadowmourne obtained!");

                        }

                        isNotEnded = false;
                    }
                }else {
                    junk.putIfAbsent(material,0);
                    junk.put(material, junk.get(material) + quantity);
                }

                if (!isNotEnded){
                    break;
                }
            }
        }

        Map<String, Integer> orderedMaterials = new LinkedHashMap<>();

        orderedMaterials.putIfAbsent("shards", 0);
        orderedMaterials.putIfAbsent("fragments", 0);
        orderedMaterials.putIfAbsent("motes", 0);

        if (materials.containsKey("shards")) {
            int shardsQuantity = materials.get("shards");
            orderedMaterials.put("shards", shardsQuantity);
        }

        if (materials.containsKey("fragments")) {
            int fragmentsQuantity = materials.get("fragments");
            orderedMaterials.put("fragments", fragmentsQuantity);
        }

        if (materials.containsKey("motes")) {
            int motesQuantity = materials.get("motes");
            orderedMaterials.put("motes", motesQuantity);
        }

        orderedMaterials.entrySet().forEach(entry -> {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        });

        junk.entrySet().forEach(entry -> {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        });
    }
}

