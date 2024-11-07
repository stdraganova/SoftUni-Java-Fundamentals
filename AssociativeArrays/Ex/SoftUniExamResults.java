package AssociativeArrays.Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> usersResults = new LinkedHashMap<>();
        Map<String, Integer> submissions = new LinkedHashMap<>();

        while (!input.equals("exam finished")){
            String user = input.split("-")[0];

            if (input.contains("banned")){
                usersResults.remove(user);
            }else {
                String language = input.split("-")[1];
                int points = Integer.parseInt(input.split("-")[2]);

                usersResults.putIfAbsent(user, 0);

                if (points > usersResults.get(user)){
                    usersResults.put(user, points);
                }

                submissions.putIfAbsent(language, 0);
                int count = submissions.get(language);
                submissions.put(language, count + 1);
            }

            input = scanner.nextLine();
        }

        System.out.println("Results:");
        usersResults.entrySet().forEach(entry -> {
            System.out.printf("%s | %d%n", entry.getKey(), entry.getValue());
        });

        System.out.println("Submissions:");
        submissions.entrySet().forEach(entry -> {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        });
    }
}
