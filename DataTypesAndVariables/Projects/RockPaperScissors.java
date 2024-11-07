package DataTypesAndVariables.Projects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String Rock = "Rock";
        String Paper = "Paper";
        String Scissors = "Scissors";

        //Players movement
        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        String playerMove = scanner.nextLine();

        if (playerMove.equals("r") || playerMove.equals("rock")){
            playerMove = Rock;
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = Paper;
        }else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = Scissors;
        }else {
            System.out.println("Invalid Input. Try Again...");
            return;
        }

        //PC movement
        Random random = new Random(); // Случаен принцип
        int computerRandomNumber = random.nextInt(4);
        String pcMove = "";

        switch (computerRandomNumber){
            case 1:
                pcMove = Rock;
                System.out.println("The computer chose Rock");
                break;

            case 2:
                pcMove = Paper;
                System.out.println("The computer chose Paper");
                break;

            case 3:
                pcMove = Scissors;
                System.out.println("The computer chose Scissors");
                break;
        }

        //Check Results

        if ((playerMove.equals(Rock) && pcMove.equals(Scissors)) ||
                (playerMove.equals(Paper) && pcMove.equals(Rock)) ||
                (playerMove.equals(Scissors) && pcMove.equals(Paper))){

            System.out.println("You win.");
        } else if ((pcMove.equals(Scissors) && playerMove.equals(Paper)) ||
            (pcMove.equals(Rock) && playerMove.equals(Scissors)) ||
                (pcMove.equals(Paper) && playerMove.equals(Rock))){

            System.out.println("You lose.");
        } else{
            System.out.println("This game was a draw.");
        }
    }
}
