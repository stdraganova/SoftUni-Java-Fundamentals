package TextProcessing.Ex;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());

        int power = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '>') {
                power += Character.getNumericValue(input.charAt(i + 1)); // Преобразуване в цяло число
            } else if (power > 0) {
                input.deleteCharAt(i);
                power--;
                i--; // Намаляване на индекса, за да се компенсира изтрития символ
            }
        }

        System.out.println(input);
    }
}
