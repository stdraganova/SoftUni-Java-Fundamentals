package FinalExam;

import java.util.Scanner;

public class String_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder codedMessage = new StringBuilder(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("Finalize")){
            String command = input[0];

            switch (command){
                case "Encrypt" -> {
                    codedMessage.reverse();
                    System.out.println(codedMessage);
                }
                case "Decrypt" -> {
                    StringBuilder newMessage = new StringBuilder();

                    for (int i = 0; i < codedMessage.length(); i++) {
                        char currentChar = codedMessage.charAt(i);
                        if (Character.isUpperCase(currentChar) && !Character.isDigit(currentChar)){
                            char newChar = Character.toLowerCase(currentChar);
                            newMessage.append(newChar);
                        } else if (Character.isLowerCase(currentChar)&& !Character.isDigit(currentChar)) {
                            char newChar = Character.toUpperCase(currentChar);
                            newMessage.append(newChar);
                        }else {
                            newMessage.append(currentChar);
                        }
                    }
                    codedMessage = newMessage;
                    System.out.println(codedMessage);
                }
                case "Substitute" -> {
                    String oldChar = input[1];
                    String newChar = input[2];

                    if (codedMessage.indexOf(oldChar) == -1){
                        System.out.println("Character not found.");
                    } else {
                        codedMessage = new StringBuilder(codedMessage.toString().replaceAll(oldChar, newChar));
                        System.out.println(codedMessage);
                    }
                }
                case "Scramble" -> {
                    int index = Integer.parseInt(input[1]);
                    String character = input[2];

                    if (index < 0 || index >= codedMessage.length()){
                        System.out.println("Index out of bounds.");
                    }else {
                        codedMessage.replace(index,index + 1, character);
                        System.out.println(codedMessage);
                    }
                }
                case "Remove" -> {
                    String substring = input[1];
                   // int startIndex = codedMessage.indexOf(substring);
                    //int endIndex = startIndex + substring.length();

                    codedMessage = new StringBuilder(codedMessage.toString().replaceAll(substring, ""));
                    System.out.println(codedMessage);
                }
                default -> {
                    System.out.println("Invalid command detected!");
                }
            }

            input = scanner.nextLine().split(" ");
        }
    }
}
