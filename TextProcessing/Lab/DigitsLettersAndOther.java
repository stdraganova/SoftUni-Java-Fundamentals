package TextProcessing.Lab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder letter = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0 ; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isDigit(currentChar)){
                digit.append(currentChar);
            } else if (Character.isAlphabetic(currentChar)) {
                letter.append(currentChar);
            }else {
                other.append(currentChar);
            }
        }

        System.out.println(digit);
        System.out.println(letter);
        System.out.println(other);

    }
}
