package TextProcessing.Ex;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                input.deleteCharAt(i);
                i--; // връщане на индекса с една позиция назад, за да се провери новия символ
            }
        }

        System.out.println(input);
    }
}
