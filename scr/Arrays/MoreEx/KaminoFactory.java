package Arrays.MoreEx;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String sequence = scanner.nextLine();

        while (!sequence.equals("Clone them!")){
            int[] array = Arrays.stream(sequence.split("!"))
                    .mapToInt(Integer::parseInt).toArray();

            int count = 0;
            sequence = scanner.nextLine();
        }
    }
}
