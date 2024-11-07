package MidExamExercises;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Програма, която принтира касов бон за части за компютър
        //Получаваме цените на частите(без таксите), докато не получим какъв клиент сме (special, regular)
        String input = scanner.nextLine();

        double priceWithoutTaxes = 0;
        double taxes = 0;
        while (!input.equals("special") && !input.equals("regular")){
            double partPrice = Double.parseDouble(input);
            //Ако цената за част < 0 -> Invalid price!
            if (partPrice < 0){
                System.out.println("Invalid price!");
            }else {
                priceWithoutTaxes += partPrice;
                //20% такса на цената на всяка част
                taxes += partPrice * 0.20;
            }
            input = scanner.nextLine();
        }

        double totalPrice = priceWithoutTaxes + taxes;
        //Ако крайната цена = 0 -> Invalid order!
        if (totalPrice == 0){
            System.out.println("Invalid order!");
            return;
        }
        //special -> 10% отстъка от крайната цена
        else if (input.equals("special")) {
            double discount = totalPrice * 0.90;
            totalPrice = discount;
        }
        //Принтиране на касовия бон
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$%n", totalPrice);
    }
}
