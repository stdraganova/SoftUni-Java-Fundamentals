package TextProcessing.Ex;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (int i = 0; i < usernames.length; i++) {
            String currentUsername = usernames[i];
            boolean validLength = validLength(currentUsername);
            boolean validContent = validContent(currentUsername);

            if (validLength && validContent){
                System.out.println(currentUsername);
            }
        }

    }

    public static boolean validLength (String currentUsername){
        boolean isValid = true;

        if (currentUsername.length() < 3 || currentUsername.length() > 16){
            isValid = false;
        }
        return isValid;
    }

    public static boolean validContent (String currentUsername){
        boolean isValid = true;

        for (int i = 0; i < currentUsername.length(); i++) {
            char currentChar = currentUsername.charAt(i);

            if (!Character.isAlphabetic(currentChar) && !Character.isDigit(currentChar) && currentChar != '_' && currentChar != '-'){
                isValid = false;
                break;
            }
        }

        return isValid;
    }
}
