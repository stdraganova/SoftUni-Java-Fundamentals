package Methods.Ex;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        middleChar(text);
    }

    public static void middleChar(String text){
        if (text.length() % 2 == 0){
            System.out.print("" + text.charAt(text.length() / 2 -1) + text.charAt(text.length() / 2));
        }else {
            System.out.println(text.charAt(text.length() / 2));
        }
    }
}
