package FinalExamExercises.Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String places = scanner.nextLine();
        String validLocation = "([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";

        Pattern pattern = Pattern.compile(validLocation);
        Matcher matcher = pattern.matcher(places);

        List<String> destinations = new ArrayList<>();
        int travelPoints = 0;

        while (matcher.find()){
            destinations.add(matcher.group("destination"));
            travelPoints += matcher.group("destination").length();
        }

        System.out.print("Destinations: ");
        if (destinations.isEmpty()){
            System.out.println();
        }else {
            System.out.println(String.join(", ", destinations));
        }
        System.out.println("Travel Points: " + travelPoints);
    }
}
