package TextProcessing.Ex;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        double sum = 0;

        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i];
            double number = Double.parseDouble(currentWord.substring(1, currentWord.length() - 1));

            number = firstLetter(currentWord, number);
            number = secondLetter(currentWord, number);

            sum += number;
        }

        System.out.printf("%.2f",sum);
    }

    public static double firstLetter (String currentWord, double number){
        char firstLetter = currentWord.charAt(0);
        int alphabetPosition = Character.isUpperCase(firstLetter) ? (firstLetter - 'A' + 1) : (firstLetter - 'a' + 1);

            if (Character.isUpperCase(firstLetter)){
                number = number / alphabetPosition;
            }else {
                number = number * alphabetPosition;
            }


        return number;
    }

    public static double secondLetter(String currentWord, double number){
            char secondLetter = currentWord.charAt(currentWord.length() - 1);
        int alphabetPosition = Character.isUpperCase(secondLetter) ? (secondLetter - 'A' + 1) : (secondLetter - 'a' + 1);

            if (Character.isUpperCase(secondLetter)){
                number = number - alphabetPosition;
            }else {
                number = number + alphabetPosition;
            }


        return number;
    }
}
