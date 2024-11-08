package RegularExpressions.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        List<String> phoneNumbers = new ArrayList<>();

        while (matcher.find()){
            phoneNumbers.add(matcher.group());
        }

        System.out.println(String.join(", ", phoneNumbers));
    }
}
