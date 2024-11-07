package TextProcessing.Lab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {
                result.append(words[i]);
            }
        }

        System.out.println(result);
    }
}
