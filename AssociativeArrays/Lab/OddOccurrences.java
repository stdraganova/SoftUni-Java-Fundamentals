package AssociativeArrays.Lab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] words = scanner.nextLine().split(" ");
        Map <String, Integer> count = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i].toLowerCase();
            if (count.containsKey(currentWord)){
                count.put(currentWord, count.get(currentWord) + 1);
            } else {
                count.put(currentWord, 1);
            }
        }

        List<String> odd = new ArrayList<>();

        for (Map.Entry<String,Integer> entry : count.entrySet()){
            if (entry.getValue() % 2 == 1){
                odd.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", odd));
    }
}
