package BasicSyntaxisConditionsAndLoops.Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double coinsTotal = 0;


        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);

            switch (input){
                case "0.1":
                case "0.2":
                case "0.5":
                case "1":
                case "2":
                    coinsTotal += coins;
                    input = scanner.nextLine();
                    break;
                default:
                    System.out.printf("Cannot accept %.2f%n", coins);
                    input = scanner.nextLine();
            }
        }

        while (!input.equals("End")){

            input = scanner.nextLine();
            if (input.equals("End")){
                break;
            }

            switch (input){
                case "Nuts":
                    //price = 2.0
                    if (coinsTotal < 2.0){
                        System.out.println("Sorry, not enough money");
                    }else {
                        coinsTotal -= 2.0;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;

                case "Water":
                    //price = 0.7
                    if (coinsTotal < 0.7){
                        System.out.println("Sorry, not enough money");
                    }else {
                        coinsTotal -= 0.7;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;

                case "Crisps":
                    //price = 1.5
                    if (coinsTotal < 1.5){
                        System.out.println("Sorry, not enough money");
                    }else {
                        coinsTotal -= 1.5;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;

                case "Soda":
                    //price = 0.8
                    if (coinsTotal < 0.8){
                        System.out.println("Sorry, not enough money");
                    }else {
                        coinsTotal -= 0.8;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;

                case "Coke":
                    //price = 1.0
                    if (coinsTotal < 1.0){
                        System.out.println("Sorry, not enough money");
                    }else {
                        coinsTotal -= 1.0;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;

                default:
                    System.out.println("Invalid product");
            }
        }

        if (input.equals("End")){
            System.out.printf("Change: %.2f", coinsTotal);
        }
    }
}
