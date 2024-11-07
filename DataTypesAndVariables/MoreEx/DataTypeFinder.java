package DataTypesAndVariables.MoreEx;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){

            //Декларираме празна променлива стринг, която ще съхранява типа данни.
            String dataType = "";

            // Проверяваме дали е булева стойност
            //IgnoreCase - игнорира малка и голяма буква
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                dataType = "boolean";
            } else if (input.length() == 1) {
                char character = input.charAt(0);
                //ако в таблицата аски е между 48:57 е инт, в другите случаи е символ.
                if (character < 48 || character > 57){
                    dataType = "character";
                }else {
                    dataType = "integer";
                }
            } else if (input.length() > 1){
                boolean isString = false;
                boolean isFloat = false;

                for (int i = 0; i < input.length(); i++) {
                    char currentSymbol = input.charAt(i);

                    if (currentSymbol < 45  || currentSymbol == 47 || currentSymbol > 57) {
                        isString = true;
                    } else if (currentSymbol == 46) {
                        isFloat = true;

                    }
                }

                if (isString){
                    dataType = "string";
                } else if (isFloat) {
                    dataType = "floating point";
                }else {
                    dataType = "integer";
                }
            }
            System.out.printf("%s is %s type%n", input, dataType);

            input = scanner.nextLine();
        }
    }
}
