package FinalExamExercises.Ex04;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder concealedMessage = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Reveal")){
            String command = input.split(":\\|:")[0];

            switch (command){
                case "InsertSpace" -> {
                    int index = Integer.parseInt(input.split(":\\|:")[1]);
                    concealedMessage.insert(index, " ");
                    System.out.println(concealedMessage);
                }
                case "Reverse" -> {
                    String substring = input.split(":\\|:")[1];
                    if (concealedMessage.indexOf(substring) != -1){
                        int startIndex = concealedMessage.indexOf(substring);
                        int endIndex = startIndex + substring.length();

                        concealedMessage.replace(startIndex, endIndex, "");
                        StringBuilder newString = new StringBuilder(substring);
                        newString.reverse();
                        concealedMessage.append(newString);
                        System.out.println(concealedMessage);
                    }else {
                        System.out.println("error");
                    }
                }
                case "ChangeAll" -> {
                    String substring = input.split(":\\|:")[1];
                    String replacement = input.split(":\\|:")[2];

                    concealedMessage = new StringBuilder(concealedMessage.toString().replaceAll(substring,replacement));
                    System.out.println(concealedMessage);
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", concealedMessage);
    }
}
