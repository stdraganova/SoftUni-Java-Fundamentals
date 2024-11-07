package BasicSyntaxisConditionsAndLoops.MoreEx;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String gameName = scanner.nextLine();
        double gamePrice = 0;
        double totalSum = 0;

        while (!gameName.equals("Game Time")){

            switch (gameName){
                case "OutFall 4":
                    gamePrice = 39.99;
                    if (currentBalance < gamePrice){
                        System.out.println("Too Expensive");
                    }else {
                        totalSum += gamePrice;
                        currentBalance -= gamePrice;
                        System.out.printf("Bought %s%n", gameName);
                    }
                    break;

                case "CS: OG":
                    gamePrice = 15.99;
                    if (currentBalance < gamePrice){
                        System.out.println("Too Expensive");
                    }else {
                        totalSum += gamePrice;
                        currentBalance -= gamePrice;
                        System.out.printf("Bought %s%n", gameName);
                    }
                    break;

                case "Zplinter Zell":
                    gamePrice = 19.99;
                    if (currentBalance < gamePrice){
                        System.out.println("Too Expensive");
                    }else {
                        totalSum += gamePrice;
                        currentBalance -= gamePrice;
                        System.out.printf("Bought %s%n", gameName);
                    }
                    break;

                case "Honored 2":
                    gamePrice = 59.99;
                    if (currentBalance < gamePrice){
                        System.out.println("Too Expensive");
                    }else {
                        totalSum += gamePrice;
                        currentBalance -= gamePrice;
                        System.out.printf("Bought %s%n", gameName);
                    }
                    break;

                case "RoverWatch":
                    gamePrice = 29.99;
                    if (currentBalance < gamePrice){
                        System.out.println("Too Expensive");
                    }else {
                        totalSum += gamePrice;
                        currentBalance -= gamePrice;
                        System.out.printf("Bought %s%n", gameName);
                    }
                    break;

                case  "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    if (currentBalance < gamePrice){
                        System.out.println("Too Expensive");
                    }else {
                        totalSum += gamePrice;
                        currentBalance -= gamePrice;
                        System.out.printf("Bought %s%n", gameName);
                    }
                    break;

                default:
                    System.out.println("Not Found");
                    break;
            }

            if (currentBalance <= 0){
                System.out.println("Out of mo-ney!");
                break;
            } else {
                gameName = scanner.nextLine();
                gamePrice = 0;
            }
        }

        if (gameName.equals("Game Time")){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSum, currentBalance);
        }

    }
}
