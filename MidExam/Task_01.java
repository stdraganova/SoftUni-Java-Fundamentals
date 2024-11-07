package MidExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> chat = new ArrayList<>();
        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")){
            String message = command[1];
            switch (command[0]){
                case "Chat" -> {chat.add(message);}
                case "Delete" -> {
                    if (chat.contains(message)){
                        chat.remove(message);
                    }
                }
                case "Edit" -> {
                    String editedMessage = command[2];
                    int index = chat.indexOf(message);
                    chat.set(index, editedMessage);
                }
                case "Pin" -> {
                    if (chat.contains(message)){
                        chat.remove(message);
                        chat.add(message);
                    }
                }
                case "Spam" -> {
                    for (int i = 1; i < command.length; i++) {
                        String spamMessage = command[i];
                        chat.add(spamMessage);
                    }
                }
            }

            command = scanner.nextLine().split(" ");
        }

        for (String message : chat){
            System.out.println(message);
        }
    }
}
