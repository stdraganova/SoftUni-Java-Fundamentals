package Methods.Ex;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isValid = true;

        if (isValidLength(password) == false){
            isValid = false;
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (isValidCharacters(password) == false){
            isValid = false;
            System.out.println("Password must consist only of letters and digits");
        }
        if (isValidDigits(password) == false){
            isValid = false;
            System.out.println("Password must have at least 2 digits");
        }
        if (isValid == true){
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidLength (String password){
        boolean isValid = true;
        if (password.length() < 6 || password.length() > 10){
            isValid = false;
        }

        return isValid;
    }

    public static boolean isValidCharacters (String password){
        boolean isValid = true;

        for (int i = 0; i < password.length(); i++) {
          if (password.charAt(i) < 48 || (password.charAt(i) > 57 && password.charAt(i) < 65) || (password.charAt(i) > 90 && password.charAt(i) < 97) || password.charAt(i) > 122){
              isValid = false;
          }
        }

        return isValid;
    }

    public static boolean isValidDigits (String password){
        boolean isValid = true;
        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57 ){
                count++;
            }
        }

        if (count < 2){
            isValid = false;
        }

        return isValid;
    }
}
