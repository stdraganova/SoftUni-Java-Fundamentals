package DataTypesAndVariables.Projects;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // PC movement
        Random random = new Random();
        int numberOfPC = random.nextInt(100);

        while (true){
            System.out.println("Guess a number (1-100): ");
            String playersInput = scanner.nextLine();

            boolean isValid = true;

            for (int i = 0; i < playersInput.length(); i++) {
                if (playersInput.charAt(i) < 48 || playersInput.charAt(i) > 57){
                    isValid = false;
                    break;
                }
            }

            if (isValid){
                int playersNumber = Integer.parseInt(playersInput);
                if (playersNumber == numberOfPC){
                    System.out.println("You guessed it!");
                } else if (playersNumber > numberOfPC) {
                    System.out.println("Too High");
                }else {
                    System.out.println("Too Low");
                }
            }else {
                System.out.println("Invalid input.");
            }
        }
    }
}
