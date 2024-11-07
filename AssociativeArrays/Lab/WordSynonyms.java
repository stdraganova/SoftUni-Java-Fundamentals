package AssociativeArrays.Lab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());
        Map <String, List<String>> words = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfInputs ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }

        for (Map.Entry<String,List<String>> entry : words.entrySet()){
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ",entry.getValue()));
        }
    }
}
