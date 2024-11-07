package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessages = scanner.nextLine();
        String regex = "([*^]+)(?<artifactName>[A-Za-z\\s]{6,})([*^]+)[^A-Za-z0-9]*\\++(?<coordinates>[0-9]+\\.?[0-9]*,-?[0-9]+\\.?[0-9]*)\\++";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(encryptedMessages);

        boolean found = false;

        while (matcher.find()) {
            found = true;
            String artefact = matcher.group("artifactName");
            String coordinates = matcher.group("coordinates");
            System.out.printf("Found %s at coordinates %s.%n", artefact, coordinates);
        }

        if (!found) {
            System.out.println("No valid artifacts found.");
        }
    }
}
