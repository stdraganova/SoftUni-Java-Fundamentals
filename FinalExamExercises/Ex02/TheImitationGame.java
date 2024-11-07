package FinalExamExercises.Ex02;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder encryptedMessage = new StringBuilder(scanner.nextLine());
        String commandInput = scanner.nextLine();

        while (!commandInput.equals("Decode")) {
            String[] command = commandInput.split("\\|");
            switch (command[0]) {
                case "Move" -> {
                    int numberOfLetters = Integer.parseInt(command[1]);
                    if (numberOfLetters > 0 && numberOfLetters <= encryptedMessage.length()) {
                        String substring = encryptedMessage.substring(0, numberOfLetters);
                        encryptedMessage.delete(0, numberOfLetters);
                        encryptedMessage.append(substring);
                    }
                }
                case "Insert" -> {
                    int index = Integer.parseInt(command[1]);
                    String value = command[2];
                    if (index >= 0 && index <= encryptedMessage.length()) {
                        encryptedMessage.insert(index, value);
                    }
                }
                case "ChangeAll" -> {
                    String substring = command[1];
                    String replacement = command[2];
                    String newMessage = encryptedMessage.toString().replace(substring, replacement);
                    encryptedMessage = new StringBuilder(newMessage);
                }
            }
            commandInput = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s%n", encryptedMessage);
    }
}
