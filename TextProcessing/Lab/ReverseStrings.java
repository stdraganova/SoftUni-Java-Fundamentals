package TextProcessing.Lab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!word.equals("end")){

            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord = reversedWord + word.charAt(i);
            }

            System.out.println(word + " = " + reversedWord);

            word = scanner.nextLine();
        }
    }
}
