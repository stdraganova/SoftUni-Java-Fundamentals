package Methods.Ex;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstCharacter = scanner.nextLine().charAt(0);
        char secondCharacter = scanner.nextLine().charAt(0);
        charactersInRange(firstCharacter, secondCharacter);
    }
    //Метод, който принтира символите между два зададени
    public static void charactersInRange(char firstCharacter, int secondCharacter){

        if (firstCharacter < secondCharacter) {

            for (int i = firstCharacter + 1; i < secondCharacter; i++) {
                System.out.print((char) i + " ");
            }
        }else {
            for (int i = secondCharacter + 1; i < firstCharacter; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
