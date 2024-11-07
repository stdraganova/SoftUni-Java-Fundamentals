package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char input = scanner.nextLine().charAt(0);
        // 1. начин:
        // Ползваме класа Character, за да определим дали
        // символа е славен или малък.

        if (Character.isUpperCase(input)){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }

        //2.начин:
        // ползваме ASCII код, за да определим дали символа е
        // голям или малък.
        // 65:90 - големи латински букви (Dec code)
        // 97:122 - малки лстински букви (Dec code)
    }
}
