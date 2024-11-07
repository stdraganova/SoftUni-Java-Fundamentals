package BasicSyntaxisConditionsAndLoops.Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String pass = "";

        for (int i = 0; i < username.length(); i++) {
            pass = username.charAt(i) + pass;
        }

        while (!password.equals(pass)) {
            System.out.println("Incorrect password. Try again.");
            password = scanner.nextLine();
        }

        System.out.printf("User %s logged in.", username);
    }
}
