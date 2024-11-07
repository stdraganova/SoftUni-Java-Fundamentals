package MidExam;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        int playersCount = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerDay =  Double.parseDouble(scanner.nextLine());
        double foodPerDay =  Double.parseDouble(scanner.nextLine());

        double totalWater = waterPerDay * day * playersCount;
        double totalFood = foodPerDay * day * playersCount;

        for (int i = 1; i <= day ; i++) {
            double energyLose = Double.parseDouble(scanner.nextLine());
            energy -= energyLose;
            if (energy <= 0){
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.%n", totalFood, totalWater);
                return;
            }
            if (i % 2 == 0){
                totalWater = totalWater * 0.70;
                energy = energy + (energy * 0.05);
            }
            if (i % 3 == 0){
                totalFood = totalFood - (totalFood / playersCount);
                energy = energy + (energy * 0.10);
            }
        }

        System.out.printf("You are ready for the quest. You will be left with - %.2f energy!%n",energy);
    }
}
