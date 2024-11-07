package FinalExamExercises.Ex01;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Оригинално име, което той иска да използва
        StringBuilder originalName = new StringBuilder(scanner.nextLine());
        // последователност от команди до получаване на команда за регистрация
        String command = scanner.nextLine();

        while (!command.equals("Registration")) {
            String[] commandParts = command.split(" ");

            switch (commandParts[0]) {
                case "Letters" -> {
                    String lettersCase = commandParts[1];
                    if (lettersCase.equals("Lower")) {
                        for (int i = 0; i < originalName.length(); i++) {
                            originalName.setCharAt(i, Character.toLowerCase(originalName.charAt(i)));
                        }
                        System.out.println(originalName);
                    } else if (lettersCase.equals("Upper")) {
                        for (int i = 0; i < originalName.length(); i++) {
                            originalName.setCharAt(i, Character.toUpperCase(originalName.charAt(i)));
                        }
                        System.out.println(originalName);
                    }
                }
                case "Reverse" -> {
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);

                    if (startIndex >= 0 && endIndex < originalName.length()) {
                        StringBuilder substring = new StringBuilder(originalName.substring(startIndex, endIndex + 1));
                        System.out.println(substring.reverse());
                    }
                }
                case "Substring" -> {
                    String substring = commandParts[1];

                    int index = originalName.indexOf(substring);
                    if (index != -1) {
                        originalName.delete(index, index + substring.length());
                        System.out.println(originalName);
                    } else {
                        System.out.printf("The username %s doesn't contain %s.%n", originalName, substring);
                    }
                }
                case "Replace" -> {
                    char character = commandParts[1].charAt(0);
                    for (int i = 0; i < originalName.length(); i++) {
                        if (originalName.charAt(i) == character) {
                            originalName.setCharAt(i, '-');
                        }
                    }
                    System.out.println(originalName);
                }
                case "IsValid" -> {
                    char character = commandParts[1].charAt(0);

                    if (originalName.indexOf(Character.toString(character)) != -1) {
                        System.out.println("Valid username.");
                    } else {
                        System.out.printf("%s must be contained in your username.%n", character);
                    }
                }
            }

            command = scanner.nextLine();
        }
    }
}
