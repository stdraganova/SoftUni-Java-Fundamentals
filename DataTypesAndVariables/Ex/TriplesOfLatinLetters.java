package DataTypesAndVariables.Ex;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){

                    char firstCh = (char) ('a' + i);
                    char secondCh = (char) ('a' + j);
                    char thirdCh = (char) ('a' + k);

                    System.out.printf("%c%c%c%n", firstCh, secondCh, thirdCh);
                }
            }
        }
    }
}
