package TextProcessing.Lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < bannedWords.length; i++) {
            String currentWord = bannedWords[i];
            text = text.replaceAll(bannedWords[i], replaceWord(currentWord).toString());
        }

        System.out.println(text);
    }

    public static StringBuilder replaceWord (String currentWord){
        StringBuilder replacement = new StringBuilder();

        for (int i = 0; i < currentWord.length(); i++) {
            replacement.append("*");
        }

        return replacement;
    }
}
