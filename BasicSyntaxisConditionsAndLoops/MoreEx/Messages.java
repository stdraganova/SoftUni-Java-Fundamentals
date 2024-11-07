package BasicSyntaxisConditionsAndLoops.MoreEx;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());
        String string = " ";
        char character = ' ';

        for (int i = 1; i <= numberOfInputs; i++){
            String input = scanner.nextLine();

            switch (input){
                case "0":
                    character = ' ';
                    string = string + character;
                    break;
                case "2":
                    character = 'a';
                    string = string + character;
                    break;

                case "22":
                    character = 'b';
                    string = string + character;
                    break;

                case "222":
                    character = 'c';
                    string = string + character;
                    break;

                case "3":
                    character = 'd';
                    string = string + character;
                    break;

                case "33":
                    character = 'e';
                    string = string + character;
                    break;

                case "333":
                    character = 'f';
                    string = string + character;
                    break;

                case "4":
                    character = 'g';
                    string = string + character;
                    break;

                case "44":
                    character = 'h';
                    string = string + character;
                    break;

                case "444":
                    character = 'i';
                    string = string + character;
                    break;

                case "5":
                    character = 'j';
                    string = string + character;
                    break;

                case "55":
                    character = 'k';
                    string = string + character;
                    break;

                case "555":
                    character = 'l';
                    string = string + character;
                    break;

                case "6":
                    character = 'm';
                    string = string + character;
                    break;

                case "66":
                    character = 'n';
                    string = string + character;
                    break;

                case "666":
                    character = 'o';
                    string = string + character;
                    break;

                case "7":
                    character = 'p';
                    string = string + character;
                    break;

                case "77":
                    character = 'q';
                    string = string + character;
                    break;

                case "777":
                    character = 'r';
                    string = string + character;
                    break;

                case "7777":
                    character = 's';
                    string = string + character;
                    break;

                case "8":
                    character = 't';
                    string = string + character;
                    break;

                case "88":
                    character = 'u';
                    string = string + character;
                    break;

                case "888":
                    character = 'v';
                    string = string + character;
                    break;

                case "9":
                    character = 'w';
                    string = string + character;
                    break;

                case "99":
                    character = 'x';
                    string = string + character;
                    break;

                case "999":
                    character = 'y';
                    string = string + character;
                    break;

                case "9999":
                    character = 'z';
                    string = string + character;
                    break;
            }
        }

        System.out.println(string);
    }
}
