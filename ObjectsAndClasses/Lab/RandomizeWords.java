package ObjectsAndClasses.Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random random = new Random();

        for (int position1 = 0; position1 < words.length; position1++) {
            int position2 = random.nextInt(words.length);

            String temp = words[position1];
            words[position1] = words[position2];
            words[position2] = temp;
        }

        // System.out.println(String.join(System.lineSeparator(), words));
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
