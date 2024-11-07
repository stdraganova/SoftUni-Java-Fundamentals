package DataTypesAndVariables.Ex;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startIndex = Integer.parseInt(scanner.nextLine());
        int endIndex = Integer.parseInt(scanner.nextLine());
        char ch = ' ';

        for (int i = startIndex; i <= endIndex; i++){
            ch = (char) i;
            System.out.print(ch + " ");
        }
    }
}
