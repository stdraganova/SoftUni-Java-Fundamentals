package Methods.Ex;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")){
            System.out.println(palindrome(input));
            input = scanner.nextLine();
        }
    }

    public static boolean palindrome(String input){
        //int number = Integer.parseInt(input);
        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)){
                isPalindrome = false;
            }
        }

        return isPalindrome;
    }
}
