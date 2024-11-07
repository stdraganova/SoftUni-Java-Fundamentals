package AssociativeArrays.Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words = scanner.nextLine().split(" ");

        Map<Character, Integer> countCharacters = new LinkedHashMap<>();

        for (int word = 0; word < words.length ; word++) {
            for (int character = 0; character < words[word].length(); character++) {
                char currentCharacter = words[word].charAt(character);

                if (!countCharacters.containsKey(currentCharacter)){
                    countCharacters.put(currentCharacter, 1);
                }else {
                    countCharacters.put(currentCharacter, countCharacters.get(currentCharacter) + 1);
                }
            }
        }

        for (Map.Entry <Character, Integer> entry : countCharacters.entrySet()){
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
