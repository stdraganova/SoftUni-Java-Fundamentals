package TextProcessing.Ex;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        StringBuilder encryptedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            int position = message.charAt(i) + 3;
            char newChar = (char) position;

            encryptedMessage.append(newChar);
        }

        System.out.println(encryptedMessage);
    }
}
