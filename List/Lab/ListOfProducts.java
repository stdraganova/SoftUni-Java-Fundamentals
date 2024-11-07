package List.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        List<String> list = new ArrayList<>();
        for (int lines = 1; lines <= number ; lines++) {
            String product = scanner.nextLine();
            list.add(product);
        }

        Collections.sort(list);

        for (int line = 1; line <= number; line++) {
            System.out.print(line + "." + list.get(line - 1));
            System.out.println();
        }
    }
}
