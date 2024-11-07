package TextProcessing.Ex;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String firstName = input.split(" ")[0];
        String secondName = input.split(" ")[1];

        int sum = multiply(firstName, secondName) + remainingSymbolsSum(firstName, secondName);

        System.out.println(sum);

    }

    public static int multiply (String firstName, String secondName){
        int shorterName = Math.min(firstName.length(), secondName.length());
        int sum = 0;

        for (int i = 0; i < shorterName; i++) {
            char firstChar = firstName.charAt(i);
            char secondChar = secondName.charAt(i);

            sum += firstChar * secondChar;
        }

        return sum;
    }

    public static int remainingSymbolsSum (String firstName, String secondName){
        String longestName = "";

        if (firstName.length() > secondName.length()){
            longestName = firstName;
        }else if (secondName.length() > firstName.length()){
            longestName = secondName;
        }

        int shorterName = Math.min(firstName.length(), secondName.length());
        int sum = 0;

        for (int i = shorterName; i < longestName.length(); i++) {
            sum += longestName.charAt(i);
        }

        return sum;
    }
}
