package BasicSyntaxisConditionsAndLoops.Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetsCount = 0;
        int mousesCount = 0;
        int keyboardCount = 0;
        int displayCount = 0;

        while (lostGamesCount >0){

            if (lostGamesCount % 2 == 0){
                headsetsCount++;
            }

            if (lostGamesCount % 3 == 0){
                mousesCount++;
            }

            if (lostGamesCount % 6 ==0){
                keyboardCount++;
            }

            if (lostGamesCount % 12 == 0 ){
                displayCount++;
            }

            lostGamesCount--;
        }

        double total = (headsetsCount * headsetPrice) + (mousesCount * mousePrice) + (keyboardCount * keyboardPrice) + (displayCount * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
