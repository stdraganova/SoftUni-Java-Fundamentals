package RegularExpressions.Ex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMessages = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<planetName>[A-Z]*[a-z]*)[^@\\-!:>]*?:(?<population>\\d+)[^@\\-!:>]*?!(?<attackType>[AD]?)![^@\\-!:>]*?->(?<soldierCount>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackPlanets = new ArrayList<>();
        int attackPlanetsCount = 0;

        List<String> destroyPlanets = new ArrayList<>();
        int destroyPlanetsCount = 0;

        for (int i = 1; i <= numberOfMessages; i++) {
            String encryptedMessage = scanner.nextLine();
            int lettersCount = getLettersCount(encryptedMessage);

            String newMessage = decryptMessage(encryptedMessage, lettersCount).toString();
            Matcher matcher = pattern.matcher(newMessage);

            while (matcher.find()){
                String planetName = matcher.group("planetName");

                if (matcher.group("attackType").equals("A")){
                    attackPlanets.add(planetName);
                    attackPlanetsCount++;
                }else {
                    destroyPlanets.add(planetName);
                    destroyPlanetsCount++;
                }
            }
        }

        Collections.sort(attackPlanets);
        Collections.sort(destroyPlanets);

        System.out.printf("Attacked planets: %d%n", attackPlanetsCount);
        for (String planet : attackPlanets){
            System.out.printf("-> %s%n", planet);
        }

        System.out.printf("Destroyed planets: %d%n", destroyPlanetsCount);
        for (String planet : destroyPlanets){
            System.out.printf("-> %s%n", planet);
        }
    }

    public static int getLettersCount(String encryptedMessage){
        int lettersCount = 0;

        for (int letter = 0; letter < encryptedMessage.length(); letter++) {
            char currentChar = Character.toLowerCase(encryptedMessage.charAt(letter));
            switch (currentChar){
                case 's':
                case 't':
                case 'a':
                case 'r':
                    lettersCount++;
                    break;
            }
        }
        return lettersCount;
    }

    public static StringBuilder decryptMessage (String encryptedMessage, int lettersCount){
        StringBuilder decryptedMessage = new StringBuilder();

        for (int letter = 0; letter < encryptedMessage.length(); letter++) {
            char currentChar = (char) (encryptedMessage.charAt(letter) - lettersCount);
            decryptedMessage.append(currentChar);
        }
        return decryptedMessage;
    }
}
