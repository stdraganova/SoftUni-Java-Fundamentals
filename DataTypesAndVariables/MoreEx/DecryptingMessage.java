package DataTypesAndVariables.MoreEx;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ключ и N числа ще бъдат вкарани след това
        byte key = Byte.parseByte(scanner.nextLine());
        byte number = Byte.parseByte(scanner.nextLine());

        String string = "";

        for (int i = 1; i <= number; i++) {

            //Четем символ от конзолата
            char character = scanner.nextLine().charAt(0);

            // Превръщаме (кастване) символа в число и добавяме ключа
            int charNum = character + key;

            //Превръщаме числото обратно в символ
            char symbol = (char) charNum;

            string = string + symbol;
        }

        System.out.println(string);
    }
}
